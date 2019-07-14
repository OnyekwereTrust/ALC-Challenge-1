package com.tjah.sampleapp

import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.webkit.SslErrorHandler
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_alc.*
import kotlinx.android.synthetic.main.activity_sample_main.*

class ALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        window.requestFeature(Window.FEATURE_PROGRESS)
        val ab = supportActionBar
        //  ab.setTitle(Html.fromHtml("<font color=#ffffff>" + "Contact a Doctor" + "</font>"));
        //ab.setIcon(getResources().getDrawable(R.drawable.ic_action_back));
        ab?.setDisplayHomeAsUpEnabled(true)


        setContentView(R.layout.activity_alc)
        // Makes Progress bar Visible
        window.setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON)



        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView, progress: Int) {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                title = "Loading..."
                setProgress(progress * 100) //Make the bar disappear after URL is loaded

                // Return the app name after finish loading
                if (progress == 100)
                    title = "About ALC"
            }
        }


        webView.loadUrl("https://www.andela.com/alc");

       // webView.setWebViewClient(HelloWebViewClient())
        webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode =true
        webView.settings.useWideViewPort = true
        webView.settings.builtInZoomControls = true
        webView.settings.pluginState = WebSettings.PluginState.ON



        /*String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */

        //webView.loadUrl("file:///android_asset/myresource.html")

    }
}
