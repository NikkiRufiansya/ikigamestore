package com.nikki.ikigamestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://ikigamestore.web.id/")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (webView.canGoBack())
            webView.goBack()
        else
            super.onBackPressed()
    }
}