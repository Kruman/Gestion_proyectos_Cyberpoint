package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class Configuraciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuraciones)

        val salvar = findViewById<Button>(R.id.save)
        val regresar = findViewById<ImageButton>(R.id.back)
        val pro = intent.getStringExtra("productos")
        val total = intent.getStringExtra("costos")

        var productos = pro
        var tot = total

        salvar.setOnClickListener(){
            Toast.makeText(this, "Datos cambiados", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Principal::class.java)
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)
            finishAffinity()
        }
        regresar.setOnClickListener(){
            val intent = Intent(this, Principal::class.java)
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)
            finishAffinity()
        }
    }
}