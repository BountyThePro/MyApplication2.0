package com.example.myapplication20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class show_data extends AppCompatActivity {

    private TextView Gmail,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Gmail = findViewById(R.id.tv1);
        password = findViewById(R.id.tv2);

        String gmail = getIntent().getStringExtra("keyname");
        String pass = getIntent().getStringExtra("keyname_pass");

        Gmail.setText(gmail);
        password.setText(pass);
    }
}