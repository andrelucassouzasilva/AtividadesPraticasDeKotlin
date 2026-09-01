package com.example.atividadesmariow

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GeometriaAreasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometria_areas)

        val radioGroupForma = findViewById<RadioGroup>(R.id.radioGroupForma)
        val edtValor1 = findViewById<EditText>(R.id.edtValor1)
        val edtValor2 = findViewById<EditText>(R.id.edtValor2)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        radioGroupForma.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioCirculo -> {
                    edtValor1.hint = "Raio"
                    edtValor2.visibility = android.view.View.GONE
                }
                R.id.radioRetangulo, R.id.radioTriangulo -> {
                    edtValor1.hint = "Base"
                    edtValor2.hint = "Altura"
                    edtValor2.visibility = android.view.View.VISIBLE
                }
            }
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val valor1 = edtValor1.text.toString().toDoubleOrNull()

            when (radioGroupForma.checkedRadioButtonId) {
                R.id.radioCirculo -> {
                    if (valor1 == null) {
                        Toast.makeText(this, "Preencha o raio corretamente", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val area = Math.PI * valor1 * valor1
                    txtResultado.text = getString(R.string.area_format, area)
                }
                R.id.radioRetangulo -> {
                    val valor2 = edtValor2.text.toString().toDoubleOrNull()
                    if (valor1 == null || valor2 == null) {
                        Toast.makeText(this, "Preencha base e altura corretamente", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val area = valor1 * valor2
                    txtResultado.text = getString(R.string.area_format, area)
                }
                R.id.radioTriangulo -> {
                    val valor2 = edtValor2.text.toString().toDoubleOrNull()
                    if (valor1 == null || valor2 == null) {
                        Toast.makeText(this, "Preencha base e altura corretamente", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    val area = valor1 * valor2 / 2
                    txtResultado.text = getString(R.string.area_format, area)
                }
            }
        }
    }
}
