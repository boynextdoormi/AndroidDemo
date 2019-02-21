package com.example.sck.activitylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    public static final String TAG="ActivityDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fristactivity);
        bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new myListener());
        Log.e(TAG,"FristActivity-->OnCreat~~~");
    }
        class myListener implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,secondActivity.class);
                startActivity(intent);
            }
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"FristActivity-->onDestroy~~~");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"FristActivity-->onPause~~~");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"FristActivity-->onRestart~~~");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"FristActivity-->onResume~~~");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"FristActivity-->onStart~~~");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"FristActivity-->onStop~~~");
    }
}
