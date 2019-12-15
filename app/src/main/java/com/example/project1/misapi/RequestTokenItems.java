package com.example.project1.misapi;

import com.google.gson.annotations.SerializedName;

public class RequestTokenItems {

    @SerializedName("code") private String code;
    @SerializedName("redirect_uri") private String uri;
    @SerializedName("client_id") private String cid;
    @SerializedName("client_secret") private String cs;
    @SerializedName("grant_type") private String gt;

    @SerializedName("access_token") private String access_token;
    @SerializedName("expires_in") private String expires_in;
    @SerializedName("refresh_token") private String refresh_token;


    public RequestTokenItems(String code, String uri, String cid, String cs, String gt, String access_token, String expires_in, String refresh_token) {
        this.code = code;
        this.uri = uri;
        this.cid = cid;
        this.cs = cs;
        this.gt = gt;
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.refresh_token = refresh_token;


    }

    public RequestTokenItems(String code, String uri, String cid, String cs, String gt) {
        this.code = code;
        this.uri = uri;
        this.cid = cid;
        this.cs = cs;
        this.gt = gt;
    }

    public RequestTokenItems(String access_token, String expires_in, String refresh_token) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.refresh_token = refresh_token;
    }

    public String getCode() {
        return code;
    }

    public String getUri() {
        return uri;
    }

    public String getCid() {
        return cid;
    }

    public String getCs() {
        return cs;
    }

    public String getGt() {
        return gt;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }
}
