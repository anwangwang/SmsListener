package com.awwhome.smslistener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: onCreate执行了");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: onResume方法被执行了 ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: onDestroy方法被执行了");
    }
}
