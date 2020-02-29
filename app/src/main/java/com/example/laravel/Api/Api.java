package com.example.laravel.Api;

import com.example.laravel.Models.LoginResults;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("login")
    Call<LoginResults> login(
            @Field("email") String email,
            @Field("password") String password
    );
}
