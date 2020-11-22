package com.example.myapplication20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class send_data extends AppCompatActivity {
    EditText ed;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);


        ed = findViewById(R.id.ed1);
        bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gmail = ed.getText().toString().trim();


                Intent i = new Intent();
                i.putExtra("name",gmail);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}