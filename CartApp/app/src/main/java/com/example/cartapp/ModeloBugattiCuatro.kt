package com.example.cartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ModeloBugattiCuatro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelo_bugatti_cuatro)

        val bRegresar = findViewById<Button>(R.id.bRegresar)

        bRegresar.setOnClickListener {
            finish()
        }
    }
}