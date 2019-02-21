package com.example.sck.activitylife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by SCK on 2018/5/5.
 */

public class secondActivity extends Activity {
    Button bt2;
    public static final String TAG="ActivityDemo";

    @Override//1
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new myListener());
        Log.e(TAG,"FristActivity-->OnCreat~~~");
    }
    class myListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(secondActivity.this,thirdActivity.class);
            startActivity(intent);
        }
    }

    @Override//2
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"secondActivity-->onDestroy~~~");
    }

    @Override//3
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"secondActivity-->onPause~~~");
    }

    @Override//4
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"secondActivity-->onRestart~~~");
    }

    @Override//5
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"secondActivity-->onResume~~~");
    }

    @Override//6
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"secondActivity-->onStart~~~");
    }

    @Override//7
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"secondActivity-->onStop~~~");
    }
}
