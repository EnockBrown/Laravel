package com.example.laravel.Api;

import com.example.laravel.Models.LoginResults;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {

    @FormUrlEncoded
    @POST("login")
    Call<LoginResults> login(
            @Field("email") String email,
            @Field("password") String password
    );
    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("c_password") String gender,
            @Field("phone") String admissionNumber
    );

    @FormUrlEncoded
    @POST("phone_verification")
    Call<ResponseBody> getCode(
            @Field("mobile_number") String mobile_number
    );

    @FormUrlEncoded
    @PUT("phone_verification/{id}")
    Call<ResponseBody> verify(
            @Path("id") String id,
            @Field("verification_code") String verification_code
    );
}
