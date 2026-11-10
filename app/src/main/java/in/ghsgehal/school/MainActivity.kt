package in.ghsgehal.school

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View
import android.view.WindowManager
import android.webkit.WebSettings

class MainActivity : Activity() {
    private lateinit var webView: WebView

    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        webView = WebView(this)
        webView.setBackgroundColor(android.graphics.Color.WHITE)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.databaseEnabled = true
        webView.settings.cacheMode = WebSettings.LOAD_DEFAULT
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.isFocusable = true
        webView.isFocusableInTouchMode = true
        webView.loadUrl("file:///android_asset/index.html")
        setContentView(webView)
    }

    override fun onBackPressed() {
        if (::webView.isInitialized && webView.canGoBack()) webView.goBack()
        else super.onBackPressed()
    }
}
