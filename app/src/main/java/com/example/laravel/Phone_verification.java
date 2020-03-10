package com.example.laravel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laravel.Api.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Phone_verification extends AppCompatActivity {

    Button next;
    TextView text;
    EditText phonenumber;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

//        String s=getIntent().getExtras().getString("name");
//        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        text=findViewById(R.id.token);
        phonenumber=findViewById(R.id.edt_phonenumber);






      // text.setText(s);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final ProgressDialog progressDialog = new ProgressDialog(Phone_verification.this);
//                progressDialog.setMessage("Please Wait...");
//                progressDialog.show();
//
                final String phone_Number=phonenumber.getText().toString().trim();
                if (phone_Number.isEmpty()){
                    phonenumber.setError("Phone Number is Require");
                    phonenumber.requestFocus();
                    return;
                }
//
//                Call<ResponseBody> call= RetrofitClient.getInstance().getApi().getCode(phone_Number);
//
//                call.enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                        progressDialog.dismiss();
//                        s=response.body().toString();
//                        Toast.makeText(Phone_verification.this, ""+s, Toast.LENGTH_LONG).show();
//                        Intent i =new Intent(Phone_verification.this,Verify.class);
//                         i.putExtra("phone",phonenumber.getText().toString().trim());
//                        startActivity(i);
//                        //finish();
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//                        progressDialog.dismiss();
//                       Toast.makeText(Phone_verification.this, t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });
                Intent i =new Intent(Phone_verification.this,Verify.class);
                         i.putExtra("phone",phonenumber.getText().toString().trim());
                startActivity(i);
            }
        });
    }
}
