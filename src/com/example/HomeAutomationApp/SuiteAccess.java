package com.example.HomeAutomationApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SuiteAccess extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://127.0.0.1:8000");
    }
}
