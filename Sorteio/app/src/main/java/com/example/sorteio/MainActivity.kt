package com.example.sorteio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){

        val texto = pt_numero.text.toString()
        val resultado = tx_resultado.text



        if (texto.isEmpty()){

           pt_numero.error = "Você deve digitar um valor"

            return

        } else if (texto.toInt() < 0 || texto.toInt() > 50){

            pt_numero.error = "Tem que ser um numero entre 0 e 50"

            return

        }

        val numeroSorteado = Random.nextInt(0,51)

        if (numeroSorteado == texto.toInt()){
            tx_resultado.text = "Número sorteado: $numeroSorteado\nParabéns, seu número foi sorteado!"
            tx_resultado.visibility = View.VISIBLE
        } else {
            tx_resultado.text = "Número sorteado: $numeroSorteado\nPoxa, não foi dessa vez que " +
                                "você conseguiu.\nMas não desista, tente novamente!"
            tx_resultado.visibility = View.VISIBLE
        }

    }

}