package com.example.pokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipoHieloCuatro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_hielo_cuatro)

        val bRegresar = findViewById<Button>(R.id.bRegresar)

        bRegresar.setOnClickListener {
            finish()
        }
    }
}