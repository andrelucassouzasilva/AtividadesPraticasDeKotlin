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

class PapelariaActivity : AppCompatActivity() {
    private val nomes = arrayOf("Caderno", "Caneta", "Marcador")
    private val precos = doubleArrayOf(12.0, 3.5, 7.0)
    private val imagens = intArrayOf(R.drawable.ic_caderno, R.drawable.ic_caneta, R.drawable.ic_marcador)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papelaria)

        val spinnerItem = findViewById<Spinner>(R.id.spinnerItem)
        val imgItem = findViewById<ImageView>(R.id.imgItem)
        val edtQtd = findViewById<EditText>(R.id.edtQtd)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        spinnerItem.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nomes)

        spinnerItem.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                imgItem.setImageResource(imagens[position])
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val qtd = edtQtd.text.toString().toIntOrNull()
            if (qtd == null || qtd <= 0) {
                Toast.makeText(this, "Preencha a quantidade corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val posicao = spinnerItem.selectedItemPosition
            val subtotal = precos[posicao] * qtd
            val total = subtotal * 1.10

            val texto = StringBuilder()
            texto.append("Item: %s\n".format(nomes[posicao]))
            texto.append("Subtotal: R$ %.2f\n".format(subtotal))
            texto.append("Taxa (10%%): R$ %.2f\n".format(total - subtotal))
            texto.append("Total: R$ %.2f".format(total))
            txtResultado.text = texto.toString()
        }
    }
}
