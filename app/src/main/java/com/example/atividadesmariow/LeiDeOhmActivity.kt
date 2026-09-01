package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LeiDeOhmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lei_de_ohm)

        val radioGroupOhm = findViewById<RadioGroup>(R.id.radioGroupOhm)
        val edtTensao = findViewById<EditText>(R.id.edtTensao)
        val edtCorrente = findViewById<EditText>(R.id.edtCorrente)
        val edtResistencia = findViewById<EditText>(R.id.edtResistencia)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val tensao = edtTensao.text.toString().toDoubleOrNull()
            val corrente = edtCorrente.text.toString().toDoubleOrNull()
            val resistencia = edtResistencia.text.toString().toDoubleOrNull()

            when (radioGroupOhm.checkedRadioButtonId) {
                R.id.radioTensao -> {
                    if (corrente == null || resistencia == null) {
                        Toast.makeText(this, "Preencha corrente e resistência", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val v = resistencia * corrente
                    txtResultado.text = getString(R.string.resultado_tensao, v)
                }
                R.id.radioCorrente -> {
                    if (tensao == null || resistencia == null || resistencia == 0.0) {
                        Toast.makeText(this, "Preencha tensão e resistência (diferente de zero)", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val i = tensao / resistencia
                    txtResultado.text = getString(R.string.resultado_corrente, i)
                }
                R.id.radioResistencia -> {
                    if (tensao == null || corrente == null || corrente == 0.0) {
                        Toast.makeText(this, "Preencha tensão e corrente (diferente de zero)", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val r = tensao / corrente
                    txtResultado.text = getString(R.string.resultado_resistencia, r)
                }
            }
        }
    }
}
