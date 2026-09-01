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

class LanchoneteActivity : AppCompatActivity() {
    private val nomes = arrayOf("Hambúrguer", "Pizza", "Salada")
    private val precos = doubleArrayOf(18.0, 35.0, 22.0)
    private val imagens = intArrayOf(R.drawable.ic_hamburguer, R.drawable.ic_pizza, R.drawable.ic_salada)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lanchonete)

        val spinnerLanche = findViewById<Spinner>(R.id.spinnerLanche)
        val imgLanche = findViewById<ImageView>(R.id.imgLanche)
        val edtQtd = findViewById<EditText>(R.id.edtQtd)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        spinnerLanche.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nomes)

        spinnerLanche.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                imgLanche.setImageResource(imagens[position])
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val qtd = edtQtd.text.toString().toIntOrNull()
            if (qtd == null || qtd <= 0) {
                Toast.makeText(this, "Preencha a quantidade corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val posicao = spinnerLanche.selectedItemPosition
            val subtotal = precos[posicao] * qtd
            val temDesconto = qtd >= 3
            val total = if (temDesconto) subtotal * (1 - 0.05) else subtotal

            val texto = StringBuilder()
            texto.append("Item: %s\n".format(nomes[posicao]))
            texto.append("Subtotal: R$ %.2f\n".format(subtotal))
            if (temDesconto) {
                texto.append("Desconto (5%%): R$ %.2f\n".format(subtotal - total))
            }
            texto.append("Total: R$ %.2f".format(total))
            txtResultado.text = texto.toString()
        }
    }
}
