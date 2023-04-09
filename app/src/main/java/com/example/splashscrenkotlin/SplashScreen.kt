package com.example.splashscrenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
      /*  Handler().postDelayed({
            val iHome = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(iHome);
        }, 4000)*/

        Looper.myLooper()?.let {
            looper -> Handler(looper).postDelayed({
            val iHome = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(iHome);
        },4000)
        }

    }
}