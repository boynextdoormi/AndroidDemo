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

public class thirdActivity extends Activity {
    Button bt3;
    public static final String TAG="ActivityDemo";

    @Override//1
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        bt3=(Button)findViewById(R.id.bt3) ;
        bt3.setOnClickListener(new myListener());
        Log.e(TAG,"thirdActivity-->OnCreat~~~");
    }
        class myListener implements View.OnClickListener{
            @Override
            public void onClick(View v) {
               finish();
            }
        }

    @Override//2
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"thirdActivity-->onDestroy~~~");
    }

    @Override//3
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"thirdActivity-->onPause~~~");
    }

    @Override//4
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"thirdActivity-->onRestart~~~");
    }

    @Override//5
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"thirdActivity-->onResume~~~");
    }

    @Override//6
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"thirdActivity-->onStart~~~");
    }

    @Override//7
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"thirdActivity-->onStop~~~");
    }
}
