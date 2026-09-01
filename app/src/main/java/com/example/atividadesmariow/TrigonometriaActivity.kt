package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class TrigonometriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trigonometria)

        val edtAngulo = findViewById<EditText>(R.id.edtAngulo)
        val chkSeno = findViewById<CheckBox>(R.id.chkSeno)
        val chkCosseno = findViewById<CheckBox>(R.id.chkCosseno)
        val chkTangente = findViewById<CheckBox>(R.id.chkTangente)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val angulo = edtAngulo.text.toString().toDoubleOrNull()

            if (angulo == null) {
                Toast.makeText(this, "Preencha o ângulo corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!chkSeno.isChecked && !chkCosseno.isChecked && !chkTangente.isChecked) {
                Toast.makeText(this, "Marque pelo menos uma opção", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val radianos = Math.toRadians(angulo)
            val resultado = StringBuilder()

            if (chkSeno.isChecked) {
                resultado.append("Seno: %.4f\n".format(sin(radianos)))
            }
            if (chkCosseno.isChecked) {
                resultado.append("Cosseno: %.4f\n".format(cos(radianos)))
            }
            if (chkTangente.isChecked) {
                resultado.append("Tangente: %.4f\n".format(tan(radianos)))
            }

            txtResultado.text = resultado.toString().trim()
        }
    }
}
