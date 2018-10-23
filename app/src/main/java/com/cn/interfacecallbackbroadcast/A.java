package com.cn.interfacecallbackbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A extends Activity implements IListener
{
    private EditText tv_a;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        tv_a = (EditText)findViewById(R.id.tv_a);
        //注册监听器
        ListenerManager.getInstance().registerListtener(this);
    }

    @Override
    public void notifyAllActivity(String str)
    {
        tv_a.setText(str);
    }
    
    public void btnClick(View v)
    {
        //a页面跳转到B页面
        Intent intent = new Intent();
        intent.setClass(this, B.class);
        startActivity(intent);
    }
}
