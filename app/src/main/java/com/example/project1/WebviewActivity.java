package com.example.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URISyntaxException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        String state;

        state = getIntent().getExtras().getString("callback");

        if(state == "receive"){
            Toast.makeText(getApplicationContext(), "Only student account to access",Toast.LENGTH_LONG).show();
        }





        String x="https://oauth.cmu.ac.th/v1/Authorize.aspx?response_type=code&client_id=N8YH2nSW6sTGyV8kACxZaX1Wf2Vq2Ybtqd2msEuB&redirect_uri=AndroidApp://StudentAssist/callback&scope=cmuitaccount.basicinfo&state=xyz";
        loadUrl(x);
    }

    private void loadUrl(String url) {

        final WebView wbView = (WebView)findViewById(R.id.cmu_wb);

        wbView.setWebChromeClient(new WebChromeClient());

        WebSettings settings = wbView.getSettings();

        settings.setBuiltInZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowContentAccess(true);

        wbView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // TODO Auto-generated method stub
                super.onPageStarted(view, url, favicon);

            }


            @Override
            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                // TODO Auto-generated method stub
                super.onReceivedError(view, errorCode, description, failingUrl);
            }

            // @Override
            // public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            //     view.loadUrl(url);

            //     return true;
            // }


            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("androidapp://")) {
                    try {
                        Context context = view.getContext();
                        //Intent intent = new Intent().parseUri(url, Intent.URI_INTENT_SCHEME);
                        Intent intent = new Intent().parseUri(url, Intent.URI_INTENT_SCHEME);

                        if (intent != null) {
                            view.stopLoading();

                            PackageManager packageManager = context.getPackageManager();
                            ResolveInfo info = packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
                            if (info != null) {
                                context.startActivity(intent);
                                finish();
                            } else {
                                  String fallbackUrl = intent.getStringExtra("browser_fallback_url");
                                  view.loadUrl(fallbackUrl);

                                // or call external broswer
//                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fallbackUrl));
//                    context.startActivity(browserIntent);
                            }

                            return true;
                        }
                    } catch (URISyntaxException e) {

                    }
                }

                return false;
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                // TODO Auto-generated method stub




                super.onPageFinished(view, url);
            }
        });

        wbView.loadUrl(url);



    }


}
