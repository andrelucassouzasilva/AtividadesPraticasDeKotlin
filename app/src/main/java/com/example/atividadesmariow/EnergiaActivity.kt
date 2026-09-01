package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EnergiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_energia)

        val edtMassa = findViewById<EditText>(R.id.edtMassa)
        val edtVelocidade = findViewById<EditText>(R.id.edtVelocidade)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val massa = edtMassa.text.toString().toDoubleOrNull()
            val velocidade = edtVelocidade.text.toString().toDoubleOrNull()

            if (massa == null || velocidade == null) {
                Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val energia = (massa * velocidade * velocidade) / 2
            txtResultado.text = "Energia: %.2f J".format(energia)
        }
    }
}
