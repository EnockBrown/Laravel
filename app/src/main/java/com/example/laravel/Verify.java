package com.example.laravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Verify extends AppCompatActivity {

    TextView phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

              String s=getIntent().getExtras().getString("phone");
              Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        phone=findViewById(R.id.user_number);
        phone.setText(s);

    }
}
