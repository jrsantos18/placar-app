package com.josemessiasjunior.placarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_volei.*

class VoleiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)

        var scoreTime1 = 0
        var scoreTime2 = 0
        var setTime1 = 0
        var setTime2 = 0
        val nomeTime1 = time1TXT.text
        val nomeTime2 = time2TXT.text
        var jogoAcabou = false

        fun verificarFimDeJogo() {
            if (setTime1 == 3) {
                //time 1 venceu o jogo
                Toast.makeText(this, "$nomeTime1 venceu a partida por $setTime1 sets a $setTime2 contra o $nomeTime2", Toast.LENGTH_LONG).show()
                jogoAcabou = true
            } else if (setTime2 == 3) {
                //time 2 venceu o jogo
                Toast.makeText(this, "$nomeTime2 venceu a partida por $setTime2 sets a $setTime1 contra o $nomeTime1", Toast.LENGTH_LONG).show()
                jogoAcabou = true
            }
        }

        fun zerarPlacarDoSetAtual() {
            scoreTime1 = 0
            scoreTime2 = 0
            scoreTime1TXT.text = scoreTime1.toString()
            scoreTime2TXT.text = scoreTime2.toString()
        }

        fun verificarFimDeSet() {
            if (scoreTime1 >= 25 || scoreTime2 >= 25) {
                if (scoreTime1 - scoreTime2 >= 2) {
                    //time 1 venceu o set
                    setTime1++
                    setScoreTime1.text = setTime1.toString()
                    zerarPlacarDoSetAtual()
                    verificarFimDeJogo()
                } else if (scoreTime2 - scoreTime1 >= 2) {
                    //time 2 venceu o set
                    setTime2++
                    setScoreTime2.text = setTime2.toString()
                    zerarPlacarDoSetAtual()
                    verificarFimDeJogo()
                }
            }
        }

        scoreTime1TXT.setOnClickListener {
            if (!jogoAcabou) {
                scoreTime1++
                scoreTime1TXT.text = scoreTime1.toString()
                service1IMG.visibility = VISIBLE
                service2IMG.visibility = GONE
                verificarFimDeSet()
            }
        }

        scoreTime2TXT.setOnClickListener {
            if (!jogoAcabou) {
                scoreTime2++
                scoreTime2TXT.text = scoreTime2.toString()
                service1IMG.visibility = GONE
                service2IMG.visibility = VISIBLE
                verificarFimDeSet()
            }
        }
    }
}
