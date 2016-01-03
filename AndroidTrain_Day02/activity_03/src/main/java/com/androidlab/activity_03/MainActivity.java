package com.androidlab.activity_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //你的姓名
    private EditText etYourName;
    //你喜欢的人的姓名
    private EditText etOtherName;
    String yourName;
    String otherName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etYourName = (EditText) findViewById(R.id.et_yourname);
        etOtherName = (EditText) findViewById(R.id.et_othername);

    }

    public void click(View v)
    {
        Intent intent = new Intent();
//        intent.putExtra("YourName",etYourName.getText().toString());
//        intent.putExtra("OtherName",etOtherName.getText().toString());
//        Bundle bundle = new Bundle();
//        bundle.pu
//        intent.putExtras(bundle);
        intent.setClass(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
