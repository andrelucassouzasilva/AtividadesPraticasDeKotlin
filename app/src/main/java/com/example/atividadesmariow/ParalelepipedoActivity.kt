package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ParalelepipedoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paralelepipedo)

        val edtA = findViewById<EditText>(R.id.edtA)
        val edtB = findViewById<EditText>(R.id.edtB)
        val edtC = findViewById<EditText>(R.id.edtC)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val a = edtA.text.toString().toDoubleOrNull()
            val b = edtB.text.toString().toDoubleOrNull()
            val c = edtC.text.toString().toDoubleOrNull()

            if (a == null || b == null || c == null) {
                Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val volume = a * b * c
            txtResultado.text = "Volume: %.2f unid³".format(volume)
        }
    }
}
