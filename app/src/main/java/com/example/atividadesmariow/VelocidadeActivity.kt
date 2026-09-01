package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VelocidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_velocidade)

        val edtDistancia = findViewById<EditText>(R.id.edtDistancia)
        val edtTempo = findViewById<EditText>(R.id.edtTempo)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val distancia = edtDistancia.text.toString().toDoubleOrNull()
            val tempo = edtTempo.text.toString().toDoubleOrNull()

            if (distancia == null || tempo == null || tempo == 0.0) {
                Toast.makeText(this, "Preencha os campos corretamente (tempo diferente de zero)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val velocidade = distancia / tempo
            txtResultado.text = "Velocidade: %.2f m/s".format(velocidade)
        }
    }
}
