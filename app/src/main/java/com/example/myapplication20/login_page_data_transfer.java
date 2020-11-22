package com.example.myapplication20;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_page_data_transfer extends AppCompatActivity {

    private EditText Gmail, password;
    private Button login;
    TextView shw;
    Button rd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_data_transfer);

        Gmail = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        login = findViewById(R.id.button2);
        rd = findViewById(R.id.button3);
        shw = findViewById(R.id.show_text);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gmail = Gmail.getText().toString();
                String pass = password.getText().toString();

                Intent i = new Intent(login_page_data_transfer.this, show_data.class);
                i.putExtra("keyname",gmail);
                i.putExtra("keyname_pass",pass);
                startActivity(i);
            }
        });

        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login_page_data_transfer.this, send_data.class);
                startActivityForResult(i, 2);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2 && resultCode == RESULT_OK )
        {
            String name = data.getStringExtra("name");
            shw.setText(name);
        }
    }
}