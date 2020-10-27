package com.adroid_training_program

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    fun infoAndroidTraingProgram(view: View)
    {
        val uri = Uri.parse("https://events.withgoogle.com/atp2020/");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    fun infoAboutMe(view: View)
    {
        val intent = Intent(this, InfoAboutMeActivity::class.java);
        startActivity(intent);
    }

    fun codeRepository(view: View)
    {
        val uri = Uri.parse("https://github.com/Laura-Oliveira/Adroid_Training_Program");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}