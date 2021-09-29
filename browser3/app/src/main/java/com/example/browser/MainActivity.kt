package com.example.browser

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        web_browser.loadUrl("http://www.google.com")
        web_browser.settings.javaScriptEnabled = true // we need to enable javascript
        web_browser.canGoBack()
        web_browser.webViewClient = WebClient(this)
        // Now we need to load an url everytime we search something
        search_btn.setOnClickListener {
            val URL = url_txt.text.toString()
            web_browser.loadUrl(URL)
        }

        //now we will add the script to return back
        back_btn.setOnClickListener {
            web_browser.goBack()
        }
    }

    class WebClient internal constructor(private val activity: Activity): WebViewClient(){
        override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
        ): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

    }

}