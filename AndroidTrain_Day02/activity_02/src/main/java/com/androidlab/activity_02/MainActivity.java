package com.androidlab.activity_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 显示跳转和隐式跳转
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void click(View v)
//    {
//        Intent intent = new Intent();
//        intent.setAction("com.androidlab.activity_02.SecondActivity");
////        intent.addCategory(Intent.CATEGORY_DEFAULT);
//        startActivity(intent);
//    }
    public void click(View v)
    {
        Intent intent = new Intent();
        //隐式设置拨号器的动作
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);
    }
}
