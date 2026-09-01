package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CelsiusParaFahrenheitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celsius_para_fahrenheit)

        val edtCelsius = findViewById<EditText>(R.id.edtCelsius)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val celsius = edtCelsius.text.toString().toDoubleOrNull()

            if (celsius == null) {
                Toast.makeText(this, "Preencha o campo corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val fahrenheit = (9 * celsius + 160) / 5
            txtResultado.text = "Temperatura: %.2f °F".format(fahrenheit)
        }
    }
}
