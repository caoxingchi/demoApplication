package site.xingchi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import site.xingchi.adapter.MusicAdapter;
import site.xingchi.pojo.Music;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private RecyclerView recyclerView;

    private List<Music> musicList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    /**
     * 初始化视图
     */
    public void initView(){
        btn=findViewById(R.id.btn);
        recyclerView=findViewById(R.id.recyclerView);
    }


    /**
     * 初始化数据
     */
    public void initData(){
        musicList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Music music=new Music();
            music.setSongName("海口"+i);
            musicList.add(music);
        }
        btn.setOnClickListener(new BtnListener());
        MusicAdapter musicAdapter=new MusicAdapter(getApplicationContext(),musicList);
        LinearLayoutManager llm=new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(llm);
        recyclerView.addItemDecoration(
                new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    class BtnListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if(v==btn){
                Toast.makeText(getApplicationContext(),"点击到我了",Toast.LENGTH_SHORT).show();
            }
        }
    }
}