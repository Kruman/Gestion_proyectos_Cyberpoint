package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val cpu = findViewById<ImageButton>(R.id.product1)
        val cel = findViewById<ImageButton>(R.id.cel)
        val gpu = findViewById<ImageButton>(R.id.product2)
        val lap = findViewById<ImageButton>(R.id.lap)
        val peri = findViewById<ImageButton>(R.id.product4)
        val mas = findViewById<ImageButton>(R.id.mas)
        val carrito = findViewById<ImageButton>(R.id.carrito)
        val config = findViewById<ImageButton>(R.id.config)
        val pro = intent.getStringExtra("productos")
        val total = intent.getStringExtra("costos")

        var productos = pro
        var tot = total

        cpu.setOnClickListener {
            val intent = Intent(this, CPUs::class.java)
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)
        }
        cel.setOnClickListener {
            val intent1 = Intent(this, Celulares::class.java)
            intent1.putExtra("productos", productos)
            intent1.putExtra("costos", tot)
            startActivity(intent1)
        }
        gpu.setOnClickListener {
            val intent2 = Intent(this, GPUs::class.java)
            intent2.putExtra("productos", productos)
            intent2.putExtra("costos", tot)
            startActivity(intent2)
        }
        lap.setOnClickListener {
            val intent3 = Intent(this, Laptops::class.java)
            intent3.putExtra("productos", productos)
            intent3.putExtra("costos", tot)
            startActivity(intent3)
        }
        peri.setOnClickListener {
            val intent4 = Intent(this, Perifericos::class.java)
            intent4.putExtra("productos", productos)
            intent4.putExtra("costos", tot)
            startActivity(intent4)
        }
        mas.setOnClickListener {
            val intent5 = Intent(this, Mas::class.java)
            intent5.putExtra("productos", productos)
            intent5.putExtra("costos", tot)
            startActivity(intent5)
        }
        carrito.setOnClickListener {
            val intent6 = Intent(this, Carrito::class.java)
            intent6.putExtra("productos", productos)
            intent6.putExtra("costos", tot)
            startActivity(intent6)
        }
        config.setOnClickListener {
            val intent6 = Intent(this, Configuraciones::class.java)
            intent6.putExtra("productos", productos)
            intent6.putExtra("costos", tot)
            startActivity(intent6)
        }

    }
}