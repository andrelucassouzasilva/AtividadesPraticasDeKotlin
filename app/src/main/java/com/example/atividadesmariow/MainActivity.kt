package com.example.atividadesmariow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val exercicios = listOf(
            "1 - Velocidade (v = d/t)" to VelocidadeActivity::class.java,
            "2 - Força (F = m*a)" to ForcaActivity::class.java,
            "3 - Energia Cinética (E = m*v²/2)" to EnergiaActivity::class.java,
            "4 - Fahrenheit para Celsius" to FahrenheitParaCelsiusActivity::class.java,
            "5 - Celsius para Fahrenheit" to CelsiusParaFahrenheitActivity::class.java,
            "6 - Volume do Paralelepípedo" to ParalelepipedoActivity::class.java,
            "7 - Equação de Torricelli" to TorricelliActivity::class.java,
            "8 - Fórmula da Diluição" to DiluicaoActivity::class.java,
            "9 - Seno, Cosseno e Tangente" to TrigonometriaActivity::class.java,
            "10 - Movimento Uniforme" to MovimentoUniformeActivity::class.java,
            "11 - Energia Mecânica" to EnergiaMecanicaActivity::class.java,
            "12 - Geometria de Áreas" to GeometriaAreasActivity::class.java,
            "13 - Lei de Ohm" to LeiDeOhmActivity::class.java,
            "14 - Loja de Produtos" to ProdutoActivity::class.java,
            "15 - Lanchonete" to LanchoneteActivity::class.java,
            "16 - Papelaria" to PapelariaActivity::class.java,
            "17 - Combustível" to CombustivelActivity::class.java
        )

        val container = findViewById<LinearLayout>(R.id.menuContainer)
        val marginPx = (8 * resources.displayMetrics.density).toInt()
        for ((titulo, activityClass) in exercicios) {
            val button = Button(this)
            button.text = titulo
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(0, marginPx, 0, marginPx)
            button.layoutParams = params
            button.setOnClickListener {
                startActivity(Intent(this, activityClass))
            }
            container.addView(button)
        }
    }
}
