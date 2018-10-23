package com.cn.interfacecallbackbroadcast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class C extends Activity implements IListener
{
    private EditText tv_c;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);
        tv_c = (EditText)findViewById(R.id.tv_c);
        ListenerManager.getInstance().registerListtener(this);
    }

    @Override
    public void notifyAllActivity(String str)
    {
        tv_c.setText(str);
    }
    
    public void btnClick(View v)
    {
        //发送广播通知所有注册该接口的监听器
        ListenerManager.getInstance().sendBroadCast("大家能收到我的信息吗");
    }
}
