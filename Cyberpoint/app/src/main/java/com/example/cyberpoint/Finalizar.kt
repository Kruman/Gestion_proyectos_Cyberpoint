package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Finalizar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalizar)
        var catalogo = findViewById<Button>(R.id.catalogo)
        var salir = findViewById<Button>(R.id.salir)

        catalogo.setOnClickListener(){
            val intent = Intent(this, Principal::class.java)
            val productos = ""
            val tot = ""
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)
        }
        salir.setOnClickListener(){
            finishAffinity()
        }

    }
}