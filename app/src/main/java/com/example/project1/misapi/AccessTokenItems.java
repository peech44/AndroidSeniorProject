package com.example.project1.misapi;

public class AccessTokenItems {


    private String access_token;
    private String expires_in;
    private String refresh_token;

    public AccessTokenItems(String access_token, String expires_in, String refresh_token) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.refresh_token = refresh_token;
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
