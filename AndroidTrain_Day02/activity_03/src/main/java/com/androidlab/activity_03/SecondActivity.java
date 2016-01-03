package com.androidlab.activity_03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by dream on 16/1/3.
 */
public class SecondActivity extends Activity {

    //定义一个TextView
    private TextView tvYinyuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //找到TextView的id
        tvYinyuan = (TextView) findViewById(R.id.tv_yinyuan);
        //得到传过来的intent里面的数据
        Intent intent = getIntent();
        String yourName = intent.getStringExtra("YourName");
        String otherName = intent.getStringExtra("OtherName");

        //随机数
        Random random = new Random();
        //100以内的随机数
        int num = random.nextInt(100);
        //将传过来的数据显示在textView里面
        tvYinyuan.setText(yourName + "和" + otherName + "的姻缘是" + num);

    }
}
