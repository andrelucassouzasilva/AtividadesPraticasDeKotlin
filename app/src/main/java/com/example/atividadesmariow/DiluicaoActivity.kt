package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiluicaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diluicao)

        val edtC1 = findViewById<EditText>(R.id.edtC1)
        val edtV1 = findViewById<EditText>(R.id.edtV1)
        val edtC2 = findViewById<EditText>(R.id.edtC2)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val c1 = edtC1.text.toString().toDoubleOrNull()
            val v1 = edtV1.text.toString().toDoubleOrNull()
            val c2 = edtC2.text.toString().toDoubleOrNull()

            if (c1 == null || v1 == null || c2 == null || c2 == 0.0) {
                Toast.makeText(this, "Preencha os campos corretamente (C2 diferente de zero)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val v2 = c1 * v1 / c2
            txtResultado.text = "Volume final (V2): %.2f".format(v2)
        }
    }
}
