package com.example.webviewkullanm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWeb = findViewById<WebView>(R.id.webView)

        myWeb.apply {
            loadUrl("https://www.google.com")
            settings.javaScriptEnabled = true
        }

    }
}