package com.example.shubham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {


    Button signin_btn, reg_btn;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        logo = (ImageView) findViewById(R.id.imgviewlogo);
        signin_btn = (Button) findViewById(R.id.signin_btn);
        reg_btn = (Button) findViewById(R.id.reg_btn);

        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,LogInActivity.class));
            }
        });

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,RegisterActivity.class));
            }
        });
    }
}
