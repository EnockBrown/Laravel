package com.example.laravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Phone_verification extends AppCompatActivity {

    Button next;
    TextView text;
    EditText phonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

//        String s=getIntent().getExtras().getString("name");
//        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        text=findViewById(R.id.token);
        phonenumber=findViewById(R.id.edt_phonenumber);
        final String phone_Number=phonenumber.getText().toString().trim();
      // text.setText(s);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Phone_verification.this,Verify.class);
                i.putExtra("phone",phonenumber.getText().toString());
                startActivity(i);
            }
        });
    }
}
