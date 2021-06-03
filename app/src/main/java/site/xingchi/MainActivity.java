package site.xingchi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
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
    }


    /**
     * 初始化数据
     */
    public void initData(){
        btn.setOnClickListener(new BtnListener());
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