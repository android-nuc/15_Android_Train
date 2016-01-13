package com.geniusvjr.singletask_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 四种启动模式
 * singletask
 * 4970
 * ae1c
 * 4970
 * 82c8
 * 如果发现有对应的Activity实例，则使此
 * Activity实例之上的其他Activity实例统统出栈，
 * 使此Activity实例成为栈顶对象，显示到幕前。
 */
public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        tv.setText(this.toString());
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
