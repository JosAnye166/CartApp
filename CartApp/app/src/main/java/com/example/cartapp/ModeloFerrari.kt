package com.example.cartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ModeloFerrari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelo_ferrari)

        val bRegresar = findViewById<Button>(R.id.bRegresar)

        bRegresar.setOnClickListener {
            finish()
        }

    }
}