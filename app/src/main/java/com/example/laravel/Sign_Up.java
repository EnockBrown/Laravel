package com.example.laravel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laravel.Api.RetrofitClient;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_Up extends AppCompatActivity {

    EditText name,email,password,c_password,phone;
    TextView textView;
    Button btn_register;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        textView=findViewById(R.id.login_textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sign_Up.this,MainActivity.class));
            }
        });
        name=findViewById(R.id.edtName);
        email=findViewById(R.id.edtEmail);
        password=findViewById(R.id.edtPassword);
        phone=findViewById(R.id.edtPhone);
        c_password=findViewById(R.id.edt_c_Password);

        btn_register=findViewById(R.id.btnsignup);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                final ProgressDialog progressDialog = new ProgressDialog(Sign_Up.this);
//                progressDialog.setMessage("Signing Up...");
//                progressDialog.show();
//
//                String user_name=name.getText().toString().trim();
//                String user_email=email.getText().toString().trim();
//                String user_password=password.getText().toString().trim();
//                String confirm_pass=c_password.getText().toString().trim();
//                String user_pahone=phone.getText().toString().trim();
//
//                if (user_name.isEmpty()){
//                    name.setError("User Nmae is Required");
//                    name.requestFocus();
//                    return;
//                }
//                if (user_email.isEmpty()){
//                    email.setError("Email is Required");
//                    email.requestFocus();
//                    return;
//                }
//                if (!Patterns.EMAIL_ADDRESS.matcher(user_email).matches()){
//                    email.setError("Enter a valid email");
//                    email.requestFocus();
//                    return;
//                }
//                if (user_pahone.isEmpty()){
//                    phone.setError("Phone Number is required");
//                    phone.requestFocus();
//                    return;
//                }
//                if (user_password.isEmpty()){
//                    password.setError("Password is required");
//                    password.requestFocus();
//                    return;
//                }
//                if (user_password.length()<6){
//                    password.setError("Password should be atleast 6 characters long");
//                    password.requestFocus();
//                    return;
//                }
//                if (confirm_pass.isEmpty()){
//                    c_password.setError("Password is required");
//                    c_password.requestFocus();
//                    return;
//                }
//                if (confirm_pass.length()<6){
//                    c_password.setError("Password should be atleast 6 characters long");
//                    c_password.requestFocus();
//                    return;
//                }
//
//                // DO REGISTRATION
//                Call<ResponseBody> call = RetrofitClient.getInstance().getApi().createUser(
//                        user_name,user_email,user_password,confirm_pass,user_pahone
//                );
//
//                call.enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                        progressDialog.dismiss();
//
//                        try {
//                            s = response.body().string();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Sign_Up.this);
                        dialog.setCancelable(false);
                        dialog.setTitle("Congrats! "+name.getText().toString().trim());
                        dialog.setMessage("You are Now part of us " +
                                "Click Next To Verify your phone Number");

                        dialog.setPositiveButton("NEXT" , new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                               // Toast.makeText(Sign_Up.this, s, Toast.LENGTH_LONG).show();
                                Intent i =new Intent(Sign_Up.this,Phone_verification.class);
                               // i.putExtra("name",s);
                                startActivity(i);
                                finish();
                            }
                        });

                        final AlertDialog alert = dialog.create();
                        alert.show();
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//                        progressDialog.dismiss();
//                        Toast.makeText(Sign_Up.this, t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });

            }

        });
    }
}
