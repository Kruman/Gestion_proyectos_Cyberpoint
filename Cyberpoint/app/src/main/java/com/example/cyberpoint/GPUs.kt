package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class GPUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpus)


        val p1 = findViewById<ImageButton>(R.id.product1)
        val p2 = findViewById<ImageButton>(R.id.product2)
        val p3 = findViewById<ImageButton>(R.id.product3)
        val p4 = findViewById<ImageButton>(R.id.product4)
        val carrito = findViewById<ImageButton>(R.id.carrito)
        val regresar = findViewById<ImageButton>(R.id.regresar)
        var productos = intent.getStringExtra("productos")
        var tot = intent.getStringExtra("costos")



        p1.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "MSI Gaming GeForce RTX 4070" + ","
            tot += "12687"+","

        }
        p2.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "Asus TUF GeForce RTX 4070 Ti" + ","
            tot += "17964"+","

        }
        p3.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "MAXSUN Geforce RTX 4070 Ti" + ","
            tot += "22440"+","

        }
        p4.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "MSI Gaming GeForce RTX™ 4070" + ","
            tot += "22440"+","

        }
        carrito.setOnClickListener {
            val intent = Intent(this, Carrito::class.java)
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)

        }
        regresar.setOnClickListener {
            val intent1 = Intent(this, Principal::class.java)
            intent1.putExtra("productos", productos)
            intent1.putExtra("costos", tot)
            startActivity(intent1)

        }
    }
}
