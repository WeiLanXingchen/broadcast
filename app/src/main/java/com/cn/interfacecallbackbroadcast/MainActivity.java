package com.cn.interfacecallbackbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void btnClick(View v)
    {
        Intent intent = new Intent();
        intent.setClass(this, A.class);
        startActivity(intent);
    }
}
