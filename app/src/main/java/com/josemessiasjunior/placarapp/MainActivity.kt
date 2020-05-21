package com.josemessiasjunior.placarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        futebolBTN.setOnClickListener {
            val intent = Intent(this, FutebolActivity::class.java)
            startActivity(intent)
        }

        voleiBTN.setOnClickListener {
            val intent = Intent(this, VoleiActivity::class.java)
            startActivity(intent)
        }
    }
}
