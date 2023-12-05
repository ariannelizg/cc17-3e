package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView

class FirstAidThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_three)

        val webView: WebView = findViewById(R.id.FirstAidThree)
        val video = "<iframe width=\"348\" height=\"250\" src=\"https://www.youtube.com/embed/P7mbnaOMFDU?si=6YZB8nExC6x5PdiT\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
    }
}