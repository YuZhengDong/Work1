package cn.edu.gdmec.d07150847.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work1","我启动了");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work1","有人加塞");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("work1","onPause()被执行了" );

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work1","onRestart()被执行了" );

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work1","onDestroy()被执行了" );

    }
}
