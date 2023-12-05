package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView

class FirstAidFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_four)


        val webView: WebView = findViewById(R.id.FirstAidFour)
        val video = "<iframe width=\"348\" height=\"250\" src=\"https://www.youtube.com/embed/v_wsV8ADwvs?si=SDjvmYU9dM56CGFj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webView.loadData(video, "text/html", "utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
    }
}