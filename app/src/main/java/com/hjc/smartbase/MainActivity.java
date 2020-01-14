package com.hjc.smartbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hjc.basemodule.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.i("tag", "");
    }
}
