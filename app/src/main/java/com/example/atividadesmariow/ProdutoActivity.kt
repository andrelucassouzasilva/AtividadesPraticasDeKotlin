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

class ProdutoActivity : AppCompatActivity() {
    private val nomes = arrayOf("Caneca", "Camiseta", "Boné")
    private val precos = doubleArrayOf(25.0, 45.0, 35.0)
    private val imagens = intArrayOf(R.drawable.ic_produto_a, R.drawable.ic_produto_b, R.drawable.ic_produto_c)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produto)

        val spinnerProduto = findViewById<Spinner>(R.id.spinnerProduto)
        val imgProduto = findViewById<ImageView>(R.id.imgProduto)
        val edtQtd = findViewById<EditText>(R.id.edtQtd)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        spinnerProduto.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nomes)

        spinnerProduto.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                imgProduto.setImageResource(imagens[position])
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val qtd = edtQtd.text.toString().toIntOrNull()
            if (qtd == null || qtd <= 0) {
                Toast.makeText(this, "Preencha a quantidade corretamente", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val posicao = spinnerProduto.selectedItemPosition
            val total = precos[posicao] * qtd
            txtResultado.text = "Produto: %s\nTotal a pagar: R$ %.2f".format(nomes[posicao], total)
        }
    }
}
