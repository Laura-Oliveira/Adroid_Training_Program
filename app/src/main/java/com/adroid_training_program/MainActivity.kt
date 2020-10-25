package com.adroid_training_program

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextPageMenu(view: View)
    {
        val intent = Intent(this, MenuActivity::class.java);
        startActivity(intent);
    }
}