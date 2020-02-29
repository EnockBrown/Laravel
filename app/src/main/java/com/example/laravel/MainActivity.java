package com.example.laravel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laravel.Api.RetrofitClient;
import com.example.laravel.Models.LoginResults;
import com.example.laravel.storage.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText email,password;
    Button btnLogin;
    TextView forgot_pwd,create_acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.username);
        create_acc=findViewById(R.id.create_acc);
        create_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,PinLock.class);
                startActivity(i);
            }
        });
        password=findViewById(R.id.password);
        btnLogin=findViewById(R.id.login);
        forgot_pwd=findViewById(R.id.forgotpwd);
        forgot_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setMessage(" Loading.... ");
                progressDialog.show();

                String username=email.getText().toString().trim();
                String pwd=password.getText().toString().trim();
//                String email=edtEmail.getText().toString().trim();
//                String password=edtPassword.getText().toString().trim();

                if (username.isEmpty()){
                    email.setError("Email is Required");
                    email.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(username).matches())
                {
                      email.setError("Enter a valid email");
                      email.requestFocus();
                      return;
                }

                if (pwd.isEmpty()){
                    password.setError("Password is Required");
                    password.requestFocus();
                    return;
                }

                Call<LoginResults> call= RetrofitClient.getInstance().getApi().login(username,pwd);
                call.enqueue(new Callback<LoginResults>() {
                    @Override
                    public void onResponse(Call<LoginResults> call, Response<LoginResults> response) {
                        progressDialog.dismiss();
                        LoginResults loginResults=response.body();
                        if (!loginResults.getError())
                        {
                            SharedPrefManager.getInstance(MainActivity.this).saveUser(loginResults.getUser());
                            Intent intent = new Intent(MainActivity.this,Home.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            Toast.makeText(MainActivity.this, loginResults.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "error"+loginResults.getError(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResults> call, Throwable t) {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
