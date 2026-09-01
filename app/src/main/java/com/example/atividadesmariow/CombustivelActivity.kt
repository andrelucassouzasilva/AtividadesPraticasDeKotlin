package com.example.atividadesmariow

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CombustivelActivity : AppCompatActivity() {
    private val nomes = arrayOf("Gasolina", "Etanol", "Diesel")
    private val precosPorLitro = doubleArrayOf(5.89, 3.99, 6.29)
    private val imagens = intArrayOf(R.drawable.ic_gasolina, R.drawable.ic_etanol, R.drawable.ic_diesel)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combustivel)

        val spinnerCombustivel = findViewById<Spinner>(R.id.spinnerCombustivel)
        val imgCombustivel = findViewById<ImageView>(R.id.imgCombustivel)
        val edtLitros = findViewById<EditText>(R.id.edtLitros)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        spinnerCombustivel.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nomes)

        spinnerCombustivel.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                imgCombustivel.setImageResource(imagens[position])
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val litros = edtLitros.text.toString().toDoubleOrNull()
            if (litros == null || litros <= 0.0) {
                Toast.makeText(this, "Preencha os litros corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val posicao = spinnerCombustivel.selectedItemPosition
            val valor = precosPorLitro[posicao] * litros
            txtResultado.text = "Combustível: %s\nValor a pagar: R$ %.2f".format(nomes[posicao], valor)
        }
    }
}
