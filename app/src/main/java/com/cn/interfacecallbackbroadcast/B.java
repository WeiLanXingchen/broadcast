package com.cn.interfacecallbackbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class B extends Activity implements IListener
{
    private EditText tv_b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
        tv_b = (EditText)findViewById(R.id.tv_b);
        ListenerManager.getInstance().registerListtener(this);
    }

    @Override
    public void notifyAllActivity(String str)
    {
        tv_b.setText(str);
    }
    
    public void btnClick(View v)
    {
        //b页面跳转到c页面
        Intent intent = new Intent();
        intent.setClass(this, C.class);
        startActivity(intent);
    }
}
