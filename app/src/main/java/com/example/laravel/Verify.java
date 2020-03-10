package com.example.laravel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laravel.Api.RetrofitClient;
import com.rengwuxian.materialedittext.MaterialEditText;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Verify extends AppCompatActivity {

    TextView phone;
    Button next;
    MaterialEditText code;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

              String s=getIntent().getExtras().getString("phone");
              Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        phone=findViewById(R.id.user_number);
        phone.setText(s);
        code=findViewById(R.id.code);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog = new ProgressDialog(Verify.this);
                progressDialog.setMessage("Please Wait...");
                progressDialog.show();

                final String v_code=code.getText().toString().trim();
                if (v_code.isEmpty()){
                    code.setError("Code is Required/Empty");
                    code.requestFocus();
                    return;
                }

                Call<ResponseBody> call= RetrofitClient.getInstance().getApi().verify(String.valueOf(10),v_code);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        progressDialog.dismiss();
                        message=response.body().toString();
                        Toast.makeText(Verify.this, ""+message, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });

    }
}
