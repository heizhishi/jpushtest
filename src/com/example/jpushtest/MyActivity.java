package com.example.jpushtest;

import android.app.Activity;
import android.os.Bundle;
import cn.jpush.android.api.JPushInterface;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
