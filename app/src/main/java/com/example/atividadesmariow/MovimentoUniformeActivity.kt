package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MovimentoUniformeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movimento_uniforme)

        val edtDistancia = findViewById<EditText>(R.id.edtDistancia)
        val edtVelocidade = findViewById<EditText>(R.id.edtVelocidade)
        val edtTempo = findViewById<EditText>(R.id.edtTempo)
        val chkDistancia = findViewById<CheckBox>(R.id.chkDistancia)
        val chkVelocidade = findViewById<CheckBox>(R.id.chkVelocidade)
        val chkTempo = findViewById<CheckBox>(R.id.chkTempo)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            if (!chkDistancia.isChecked && !chkVelocidade.isChecked && !chkTempo.isChecked) {
                Toast.makeText(this, "Marque o que deseja calcular", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val d = edtDistancia.text.toString().toDoubleOrNull()
            val v = edtVelocidade.text.toString().toDoubleOrNull()
            val t = edtTempo.text.toString().toDoubleOrNull()
            val resultado = StringBuilder()

            if (chkDistancia.isChecked) {
                if (v == null || t == null) {
                    Toast.makeText(this, "Preencha velocidade e tempo", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                resultado.append("Distância: %.2f m\n".format(v * t))
            }
            if (chkVelocidade.isChecked) {
                if (d == null || t == null || t == 0.0) {
                    Toast.makeText(this, "Preencha distância e tempo (tempo diferente de zero)", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                resultado.append("Velocidade: %.2f m/s\n".format(d / t))
            }
            if (chkTempo.isChecked) {
                if (d == null || v == null || v == 0.0) {
                    Toast.makeText(this, "Preencha distância e velocidade (velocidade diferente de zero)", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                resultado.append("Tempo: %.2f s\n".format(d / v))
            }

            txtResultado.text = resultado.toString().trim()
        }
    }
}
