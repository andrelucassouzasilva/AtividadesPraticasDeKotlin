package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FahrenheitParaCelsiusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrenheit_para_celsius)

        val edtFahrenheit = findViewById<EditText>(R.id.edtFahrenheit)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val fahrenheit = edtFahrenheit.text.toString().toDoubleOrNull()

            if (fahrenheit == null) {
                Toast.makeText(this, "Preencha o campo corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val celsius = 5 * (fahrenheit - 32) / 9
            txtResultado.text = "Temperatura: %.2f °C".format(celsius)
        }
    }
}
