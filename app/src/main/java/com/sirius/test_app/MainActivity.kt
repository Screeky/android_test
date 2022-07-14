package com.sirius.test_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidButton: Button = findViewById(R.id.install_button)
        androidButton.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/570/Dota_2/")))
        }

    }
}