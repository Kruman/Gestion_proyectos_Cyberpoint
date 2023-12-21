package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Celulares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celulares)
        val p1 = findViewById<ImageButton>(R.id.product1)
        val p2 = findViewById<ImageButton>(R.id.product2)
        val p3 = findViewById<ImageButton>(R.id.product3)
        val p4 = findViewById<ImageButton>(R.id.product4)
        val carrito = findViewById<ImageButton>(R.id.carrito)
        val regresar = findViewById<ImageButton>(R.id.regresar)
        var pro = intent.getStringExtra("productos")
        var total = intent.getStringExtra("costos")

        var productos= pro
        var tot = total

        p1.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "Google Pixel 6" + ","
            tot += "5519"+ ","

        }
        p2.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "Xiaomi 10C NFC" + ","
            tot += "2498"+ ","

        }
        p3.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "Apple iPhone SE" + ","
            tot += "3778"+ ","

        }
        p4.setOnClickListener {
            Toast.makeText(this, "Producto agregado", Toast.LENGTH_LONG).show()
            productos += "Apple iPhone 11" + ","
            tot += "6779"+ ","

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
