package com.androidlab.activity_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * 1、第一个跳转程序
 * 特别注意在manifest文件里面注册Activity
 * 2、按钮的四种监听方式
 *
 */
public class MainActivity extends AppCompatActivity {

    //    private RelativeLayout rlMain;
//    private Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnClick = (Button) findViewById(R.id.btn_click);
//        btnClick.setOnClickListener(new OnClickListener());
//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
/**
 * setContentView里面的布局被一层FrameLayout包裹着
 */
//        rlMain = (RelativeLayout) findViewById(R.id.rl_main);
//        ViewParent viewParent = rlMain.getParent();
//        Log.d("TAG", viewParent.toString());
//        ContentFrameLayout contentFrameLayout;
    }

//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this, SecondActivity.class);
//        startActivity(intent);
//    }


    //在xml文件中写android:onClick="click"，执行Activity里面的click方法
    public void click(View v)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
