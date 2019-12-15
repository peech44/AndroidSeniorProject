package com.example.project1.misapi;

import com.example.project1.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitMisProfile {


    private static final String MisHost = "https://misapi.cmu.ac.th";
    private static RetrofitMisProfile mInstance;

    private Retrofit retrofit;


    private RetrofitMisProfile(){


        retrofit = new Retrofit.Builder()
                .baseUrl(MisHost)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitMisProfile getInstance(){


        if(mInstance == null){
            mInstance = new RetrofitMisProfile();
        }
        return mInstance;
    }

    public Api getApi(){

        return retrofit.create(Api.class);
    }
}
