package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EnergiaMecanicaActivity : AppCompatActivity() {
    companion object {
        const val GRAVIDADE = 9.8
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_energia_mecanica)

        val edtMassa = findViewById<EditText>(R.id.edtMassa)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val edtVelocidade = findViewById<EditText>(R.id.edtVelocidade)
        val chkEp = findViewById<CheckBox>(R.id.chkEp)
        val chkEc = findViewById<CheckBox>(R.id.chkEc)
        val chkEm = findViewById<CheckBox>(R.id.chkEm)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val massa = edtMassa.text.toString().toDoubleOrNull()
            val altura = edtAltura.text.toString().toDoubleOrNull()
            val velocidade = edtVelocidade.text.toString().toDoubleOrNull()

            if (massa == null || altura == null || velocidade == null) {
                Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!chkEp.isChecked && !chkEc.isChecked && !chkEm.isChecked) {
                Toast.makeText(this, "Marque pelo menos uma opção", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val ep = massa * GRAVIDADE * altura
            val ec = (massa * velocidade * velocidade) / 2
            val resultado = StringBuilder()

            if (chkEp.isChecked) {
                resultado.append("Energia Potencial: %.2f J\n".format(ep))
            }
            if (chkEc.isChecked) {
                resultado.append("Energia Cinética: %.2f J\n".format(ec))
            }
            if (chkEm.isChecked) {
                resultado.append("Energia Mecânica: %.2f J\n".format(ep + ec))
            }

            txtResultado.text = resultado.toString().trim()
        }
    }
}
