package com.example.project1;

import com.example.project1.misapi.MisProfileItems;
import com.example.project1.misapi.RequestTokenDAO;
import com.example.project1.misapi.RequestTokenItems;
import com.example.project1.reg_api_cmr30.RegInfoCMR30Items;
import com.example.project1.reg_api_current_enrollment.RegInfoEnrollmentItems;
import com.example.project1.reg_api_home.RegInfoHomeDAO;
import com.example.project1.reg_api_home.RegInfoHomeItems;
import com.example.project1.reg_api_student.RegInfoStudentItems;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {


    @FormUrlEncoded
    @POST("/v1/GetToken.aspx")
    Call<RequestTokenItems> LoadToken (
            @Field("code") String code,
            @Field("redirect_uri") String uri,
            @Field("client_id") String cid,
            @Field("client_secret") String cs,
            @Field("grant_type") String gt
    );

    @GET("/cmuitaccount/v1/api/cmuitaccount/basicinfo")
    Call<MisProfileItems> Getmisinfo(
            @Header("Authorization") String acctoken
    );



    //for student gpa with student id
    //old
    //@GET("/v2/student/{id}/gpa")
    //new api can't get info from gpa tbl
    @Headers({"Accept: application/json"})
    @GET("/v2/student/{id}/gpa")
    Call<List<RegInfoHomeItems>> GetRegGpa(


            @Path("id") String id


    );

    //for current enroll with student id
    @Headers({"Accept: application/json"})
    @GET("/v2/student/{id}/enrollment")
    Call<List<RegInfoEnrollmentItems>> GetRegCurrentEnrollment(

            @Path("id") String id


    );

    //for cmr30 with reg id
    @Headers({"Accept: application/json"})
    @GET("/v2/cmr30/{id}")
    Call<RegInfoCMR30Items> GetRegCMR30(

            @Path("id") String id

    );

    //for student info from tbl current student
    @Headers({"Accept: application/json"})
    @GET("/v2/student/{id}")
    Call<RegInfoStudentItems> GetRegStudent(

            @Path("id") String id
    );

    @Headers("Accept: application/json")
    @GET("/v2/student/count")
    Call<RegInfoHomeDAO> Getcount(

    );


    //test
    @Headers({"Accept: application/json"})
    @GET("/v2/student/580611044/gpa")
    Call<List<RegInfoHomeItems>> Gettest(

    );

    @Headers({"Accept: application/json"})
    @GET("/v2/cmr30/269497012000")
    Call<RegInfoCMR30Items> GetRegCMRtest(



    );




}
