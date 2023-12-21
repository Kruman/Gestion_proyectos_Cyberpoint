package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Carrito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val pro = intent.getStringExtra("productos")
        val total = intent.getStringExtra("costos")
        val produc = findViewById<TextView>(R.id.produc)
        val tottal = findViewById<TextView>(R.id.tottal)
        val cost = findViewById<TextView>(R.id.cost)
        val regresar = findViewById<ImageButton>(R.id.regresar)
        val cancelar = findViewById<Button>(R.id.cancelar)
        val aceptar = findViewById<Button>(R.id.aceptar)

        var productos= pro
        var tot = total

        var registro = ""
        var valor = ""
        var totttal =0

        if (productos != null) {
            registro = productos
        }
        if (tot != null) {
            valor = tot
        }
        val array = registro.split(",").toTypedArray()
        val array2 = valor.split(",").toTypedArray()


        var acom = ""

        for (dato in array) {

            acom = acom + dato +"\n"+"\n"

        }

        produc.text = acom

        var acomu=""
        var acomo =""

        for (dato in array2) {
            if(dato!="") {
                acomu = acomu + "$" + dato + "\n" + "\n"
                acomo = dato
                totttal += acomo.toInt()
            }
        }

        cost.text = acomu
        tottal.text = "$"+totttal.toString()


        regresar.setOnClickListener(){
            val intent1 = Intent(this, Principal::class.java)
            intent1.putExtra("productos", productos)
            intent1.putExtra("costos", tot)
            startActivity(intent1)
        }

        cancelar.setOnClickListener(){
            val intent2 = Intent(this, Principal::class.java)
            intent2.putExtra("productos", "")
            intent2.putExtra("costos", "")
            Toast.makeText(this, "Compra Eliminada", Toast.LENGTH_LONG).show()
            startActivity(intent2)
        }
        aceptar.setOnClickListener(){
            val intent3 = Intent(this, Finalizar::class.java)
            intent3.putExtra("productos", "")
            intent3.putExtra("costos", "")
            startActivity(intent3)
        }
    }
}