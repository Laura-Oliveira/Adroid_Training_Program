package com.adroid_training_program

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoAboutMeActivity:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_about_me);
    }

    fun infoLinkedin(view:View)
    {
        val uri = Uri.parse("https://www.linkedin.com/in/laura-oliveira-mobile");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    fun infoGithub(view:View)
    {
        val uri = Uri.parse("https://github.com/Laura-Oliveira");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    fun infoPortfolio(view:View)
    {
        val uri = Uri.parse("https://laura-oliveira.github.io/");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    fun infoMedium(view:View)
    {
        val uri = Uri.parse("https://medium.com/@laura.regina.cp");
        val intent = Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
