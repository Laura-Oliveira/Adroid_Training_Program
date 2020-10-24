package com.adroid_training_program

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity()
{
    /* Timer Splash Screen */
    private val SPLASH_TIME_OUT = 5000;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Handler(Looper.getMainLooper()).postDelayed(
            {

                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000
        )

    }
}