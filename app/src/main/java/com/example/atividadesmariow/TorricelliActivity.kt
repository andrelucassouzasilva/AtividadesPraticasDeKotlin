package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class TorricelliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torricelli)

        val edtV0 = findViewById<EditText>(R.id.edtV0)
        val edtA = findViewById<EditText>(R.id.edtA)
        val edtDs = findViewById<EditText>(R.id.edtDs)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val v0 = edtV0.text.toString().toDoubleOrNull()
            val a = edtA.text.toString().toDoubleOrNull()
            val ds = edtDs.text.toString().toDoubleOrNull()

            if (v0 == null || a == null || ds == null) {
                Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val vQuadrado = v0 * v0 + 2 * a * ds
            if (vQuadrado < 0) {
                txtResultado.text = "Valores inválidos: v² seria negativo"
                return@setOnClickListener
            }

            val v = sqrt(vQuadrado)
            txtResultado.text = "Velocidade final: %.2f m/s".format(v)
        }
    }
}
