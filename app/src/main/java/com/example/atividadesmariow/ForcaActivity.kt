package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForcaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forca)

        val edtMassa = findViewById<EditText>(R.id.edtMassa)
        val edtAceleracao = findViewById<EditText>(R.id.edtAceleracao)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val massa = edtMassa.text.toString().toDoubleOrNull()
            val aceleracao = edtAceleracao.text.toString().toDoubleOrNull()

            if (massa == null || aceleracao == null) {
                Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val forca = massa * aceleracao
            txtResultado.text = "Força: %.2f N".format(forca)
        }
    }
}
