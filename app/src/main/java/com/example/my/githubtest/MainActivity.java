package com.example.my.githubtest;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//测试
public class MainActivity extends AppCompatActivity {
    private TextView textView_main;
    private TextView username;
    private TextView password;
    private ImageView image_main;
    private Button button_main;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ceshi", Toast.LENGTH_LONG).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Hello").setIcon(R.mipmap.ic_launcher);
                builder.show();

                ProgressDialog progressDialog=new ProgressDialog(context);
                progressDialog.show();
            }
        });
    }

    private void initData() {
        context = this;
    }

    private void initView() {
        textView_main = (TextView) findViewById(R.id.textView_main);
        image_main = (ImageView) findViewById(R.id.image_main);
        button_main = (Button) findViewById(R.id.button_main);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void clickView(View view) {
        Toast.makeText(context, "123", Toast.LENGTH_SHORT).show();
    }
}
