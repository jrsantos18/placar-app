package com.josemessiasjunior.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_volei.*

class VoleiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)

        var scoreTime1 = 0
        var scoreTime2 = 0

        scoreTime1TXT.setOnClickListener {
            scoreTime1++
            scoreTime1TXT.text = scoreTime1.toString()
            service1IMG.visibility = VISIBLE
            service2IMG.visibility = GONE
        }

        scoreTime2TXT.setOnClickListener {
            scoreTime2++
            scoreTime2TXT.text = scoreTime2.toString()
            service1IMG.visibility = GONE
            service2IMG.visibility = VISIBLE
        }

        //Quando o set se encerra?
        //Um dos times atinge, pelo menos, 25 pontos e tem pelo menos 2 pontos de vantagem
    }
}
