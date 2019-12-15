package com.example.project1;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.project1.misapi.AccessTokenDAO;
import com.example.project1.misapi.AccessTokenItems;
import com.example.project1.misapi.MisProfileItems;
import com.example.project1.misapi.RequestTokenDAO;
import com.example.project1.misapi.RequestTokenItems;
import com.example.project1.misapi.RetrofitMisProfile;
import com.example.project1.misapi.RetroftClient;
import com.example.project1.Api;
import com.google.gson.Gson;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//import okhttp3.ResponseBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class ReceiveMainActivity extends AppCompatActivity {

    //private AccessTokenModel accessTokenModel;
    private AccessTokenDAO DAO;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_receive_main);



        Uri data = getIntent().getData();
        String scheme = data.getScheme(); // "http"
        String host = data.getHost(); // "twitter.com"
        String account = "";


        //id ของ mis
        final String cid = "N8YH2nSW6sTGyV8kACxZaX1Wf2Vq2Ybtqd2msEuB";
        final String cs = "zJf3W28GgXCp6XK1hcC9CB4hqzsu2Y35h5ACR7ap";
        final String gt = "authorization_code";
        final String ui = "AndroidApp://StudentAssist/callback";


        //มี code แล้ว
        final String code = data.getQueryParameter("code");

        //final String access_token = data.getQueryParameter("access_token");
        //final String refresh_token = data.getQueryParameter("refresh_token");

        //Toast.makeText(getApplicationContext(), "MIS code"+code,Toast.LENGTH_LONG).show();


        //RequestTokenItems requestTokenItems = new RequestTokenItems(code,ui,cid,cs,gt);
        //Toast.makeText(getApplicationContext(), requestTokenItems.getGt(),Toast.LENGTH_LONG).show();

       //Call<ResponseBody> call = RetroftClient.getInstance().getApi().
        //retrofit2.Call<RequestTokenDAO> call = RetroftClient.getInstance().getApi()
       //retrofit2.Call<RequestBody> call = RetroftClient.getInstance().getApi().
        //retrofit2.Call<ResponseBody> call = RetroftClient.getInstance().getApi().LoadToken(code, ui,cid,cs,gt);
        //Call<ResponseBody> call = RetroftClient.getInstance().getApi().LoadToken(code,ui,cid,cs,gt);
        Call<RequestTokenItems> call = RetroftClient.getInstance().getApi().LoadToken(code,ui,cid,cs,gt);

        call.enqueue(new Callback<RequestTokenItems>() {
            @Override
            public void onResponse(Call<RequestTokenItems> call, Response<RequestTokenItems> response) {




                if(response.isSuccessful()){
                    RequestTokenItems tokenItems = response.body();
                    String acctoken = tokenItems.getAccess_token();
                    //Toast.makeText(getApplicationContext(), "acc_Token = "+acctoken,Toast.LENGTH_LONG).show();

                    Call<MisProfileItems> calluser = RetrofitMisProfile.getInstance().getApi().Getmisinfo("Bearer "+acctoken);

                    calluser.enqueue(new Callback<MisProfileItems>() {
                        @Override
                        public void onResponse(Call<MisProfileItems> call, Response<MisProfileItems> response) {

                            MisProfileItems userProfile = response.body();

                            String st_id = userProfile.getStudent_id();
                            String st_prenameth = userProfile.getPrename_TH();
                            String st_nameth = userProfile.getFirstname_TH();
                            String st_lnameth = userProfile.getLastname_TH();
                            String cmu_account = userProfile.getCmuitaccount();
                            String faculty = userProfile.getOrganization_name_TH();

                            String itaccounttype_id = userProfile.getItaccounttype_id();

                            //Toast.makeText(getApplicationContext(), "response step7 ID = "+st_id+" "+"\n"+"itaccounttype_id = "+itaccounttype_id ,Toast.LENGTH_LONG).show();

                            if(itaccounttype_id.equals("StdAcc")){

                                //Toast.makeText(getApplicationContext(), "itaccounttype_id == StdAcc",Toast.LENGTH_LONG).show();

                                Intent intentGo = new Intent(ReceiveMainActivity.this, MainActivity.class);
                                intentGo.putExtra("st_id",st_id);
                                intentGo.putExtra("st_prenameth", st_prenameth);
                                intentGo.putExtra("st_nameth", st_nameth);
                                intentGo.putExtra("st_lnameth", st_lnameth);
                                intentGo.putExtra("cmu_account", cmu_account);
                                intentGo.putExtra("faculty", faculty);
                                startActivity(intentGo);
                                finish();


                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Only student account to access",Toast.LENGTH_LONG).show();


                                String state = "receive";
                                Intent intentBack = new Intent(ReceiveMainActivity.this, WebviewActivity.class);
                                intentBack.putExtra("inform", "Only student account to access");
                                intentBack.putExtra("callback", state);
                                startActivity(intentBack);
                                finish();


                            }








                        }

                        @Override
                        public void onFailure(Call<MisProfileItems> call, Throwable t) {

                            Toast.makeText(getApplicationContext(), "Step 7 Failll",Toast.LENGTH_LONG).show();

                        }
                    });



                }
                else{
                    Toast.makeText(getApplicationContext(), "Fail Step5 server doen't send response",Toast.LENGTH_LONG).show();

                }



            }

            @Override
            public void onFailure(Call<RequestTokenItems> call, Throwable t) {

            }
        });

        /*call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Toast.makeText(getApplicationContext(), "belowonResponse",Toast.LENGTH_LONG).show();

                if(response.isSuccessful()){

                    Toast.makeText(getApplicationContext(), "step5 response access token",Toast.LENGTH_LONG).show();


                    ResponseBody accessTokenDAO = response.body();


                    Map param = new HashMap();
                    param.put("access_token", response.body().toString());
                    Toast.makeText(getApplicationContext(), "param is "+param,Toast.LENGTH_LONG).show();

                    Call<MisProfileItems> calluser = RetrofitMisProfile.getInstance().getApi().Getmisinfo(param.toString());





                    //Intent intent = new Intent(ReceiveMainActivity.this, MainActivity.class);
                    //startActivity(intent);
                    //finish();




                }
                else {
                    Toast.makeText(getApplicationContext(), "response not success",Toast.LENGTH_LONG).show();

                }





            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "void onFailure",Toast.LENGTH_LONG).show();

            }
        });*/





        /*Call<AccessTokenModel> call = HttpLoginManager.getInstance().getService().loadToken(code, cid, cs, gt, ui);


        call.enqueue(new Callback<AccessTokenModel>() {


            @Override
            public void onResponse(Call<AccessTokenModel> call, Response<AccessTokenModel> response) {

                if (response.isSuccessful()) {
                    accessTokenModel = response.body();
                    Map param = new HashMap();
                    param.put("access_token", accessTokenModel.getAccessToken().toString());

                    Call<UserCMUAccountModel> callUser = HttpLoginManager.getInstance().getService().loadUserProfile(param);
                    callUser.enqueue(new Callback<UserCMUAccountModel>()  {
                        @Override
                        public void onResponse(Call<UserCMUAccountModel> callUser, Response<UserCMUAccountModel> response) {
                            if (response.isSuccessful()) {



                                // Get data Door list
                                //======================================

                                //======================================
                                UserCMUAccountModel dao = response.body();

                                //dao.setX=null;

                                String json = new Gson().toJson(dao);
                                LocalData.saveUser(json);
                                String token = accessTokenModel.getAccessToken().toString();
                                LocalData.saveLoginState(token);
                                Intent intent = new Intent(Contextor.getInstance().getContext(), MainActivity.class);
                                startActivity(intent);
                                finish();

                            } else {

                            }
                        }

                        @Override
                        public void onFailure(Call<UserCMUAccountModel> call, Throwable t) {

                        }
                    });
                }


            }

            @Override
            public void onFailure(Call<AccessTokenModel> call, Throwable t) {

            }
        });*/

    }



    @Override
    protected void onDestroy() {

        super.onDestroy();


    }




}
