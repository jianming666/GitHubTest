package com.example.my.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView_main;
    private ImageView image_main;
    private ImageView image_main_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView_main = (TextView) findViewById(R.id.textView_main);
        image_main = (ImageView) findViewById(R.id.image_main);
        image_main_icon = (ImageView) findViewById(R.id.image_main_icon);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
