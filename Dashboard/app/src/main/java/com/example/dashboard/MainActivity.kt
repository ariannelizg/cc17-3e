package com.example.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById<WebView>(R.id.web_view)

        val video : String = "<iframe width=\"345\" height=\"215\" src=\"https://www.youtube.com/embed/Z0M0sL2-khQ?si=gg9KnQ7IWsJH_MP0?  autoplay=1\"  title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        webView.loadData(video, "text/html","uft-8")
        webView.getSettings().javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
    }
}