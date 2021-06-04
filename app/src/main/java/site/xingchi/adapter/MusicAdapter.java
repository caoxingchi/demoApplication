package site.xingchi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import site.xingchi.R;
import site.xingchi.pojo.Music;

/**
 * 音乐列表适配器
 */
public class MusicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Music> musicList;

    private LayoutInflater ll;

    public MusicAdapter(Context context, List<Music> musicList) {
        this.context = context;
        this.musicList = musicList;
        this.ll=LayoutInflater.from(context);
    }

    /**
     * 初始化单个item
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=ll.inflate(R.layout.single_item_music,parent,false);
        return new ItemViewHolder(view);
    }

    /**
     * 初始化数据
     * 绑定组件 一些事件的监听 包含点击等操作
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        ((ItemViewHolder)holder).updateMusic();

        ((ItemViewHolder) holder).textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Music music=musicList.get(position);
                String songName = music.getSongName();
                Toast.makeText(context,"点击到了=="+songName,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.single_text);
        }

        /**
         * 更新数据
         */
        public void updateMusic(){
            int position = this.getAdapterPosition();
            Music m=musicList.get(position);
            textView.setText(m.getSongName());
        }
    }
}
