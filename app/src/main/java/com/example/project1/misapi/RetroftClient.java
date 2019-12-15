package com.example.project1.misapi;


import com.example.project1.Api;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroftClient {


    private static final String RequestTokenHost = "https://oauth.cmu.ac.th";
    private static RetroftClient mInstance;
    private Retrofit retrofit;

    private RetroftClient(){

        /*retrofit = new Retrofit.Builder()
                .baseUrl(RequestTokenHost)
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/
        retrofit = new Retrofit.Builder()
                .baseUrl(RequestTokenHost)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetroftClient getInstance(){

        if(mInstance == null){
            mInstance = new RetroftClient();
        }
        return mInstance;
    }

   public Api getApi(){
        return retrofit.create(Api.class);
   }
}
