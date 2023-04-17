package com.example.betterfront.activity

import android.os.Build
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.betterfront.R
import com.example.betterfront.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_Betterfront)
        setContentView(binding.root)
        setUpWebView() // to setUp webView of BetterFront Website
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setUpWebView() {
        binding.webView.webViewClient=WebViewClient()

        binding.webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.betterfront.io/#")
        }
    }
}