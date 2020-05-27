package com.josemessiasjunior.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_futebol.*

class FutebolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        var scoreTime1 = 0
        var scoreTime2 = 0

        scoreTime1TXT.setOnClickListener {
            scoreTime1++
            scoreTime1TXT.text = scoreTime1.toString()
        }

        scoreTime2TXT.setOnClickListener {
            scoreTime2++
            scoreTime2TXT.text = scoreTime2.toString()
        }
    }
}
