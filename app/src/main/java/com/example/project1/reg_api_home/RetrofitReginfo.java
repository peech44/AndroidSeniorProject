package com.example.project1.reg_api_home;

import android.util.Base64;

import com.example.project1.Api;
import com.example.project1.misapi.RetrofitMisProfile;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitReginfo {
    //for abasic auth
    //hide base64 auth with user&pass
    private static final String AUTH = "Basic "+ Base64.encodeToString(("xxxxx:xxxxx").getBytes(), Base64.NO_WRAP);

    //web api
    private static final String RegHost = "https://xxxxx";
    private static RetrofitReginfo mInstance;
    private Retrofit retrofit;

    private RetrofitReginfo(){


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {

                                //return null;
                                Request original = chain.request();
                                Request.Builder requestBuilder = original.newBuilder()
                                        .addHeader("Authorization" , AUTH)
                                        .method(original.method(), original.body());

                                Request request = requestBuilder.build();
                                return chain.proceed(request);
                            }
                        }
                ).build();


        retrofit = new Retrofit.Builder()
                .baseUrl(RegHost)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static synchronized RetrofitReginfo getInstance(){

        if(mInstance == null){
            mInstance = new RetrofitReginfo();
        }
        return mInstance;
    }

    public Api getApi(){

        return retrofit.create(Api.class);
    }
}
