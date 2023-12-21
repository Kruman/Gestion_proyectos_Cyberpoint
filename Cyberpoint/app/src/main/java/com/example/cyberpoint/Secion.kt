package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Secion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secion)

        val name = findViewById<EditText>(R.id.name)
        val pass = findViewById<EditText>(R.id.pass)
        val entrar = findViewById<Button>(R.id.entrar)
        val regis = findViewById<Button>(R.id.registrarse)
        val mal = findViewById<TextView>(R.id.inco)

        var nom = intent.getStringExtra("nombre")
        var contra = intent.getStringExtra("contraseña")

        var n = nom
        var co = contra
        var nombre = ""
        var password = ""

        fun onFinish() {
            val intent = Intent(this, Principal::class.java)
            val productos = ""
            val tot = ""
            intent.putExtra("productos", productos)
            intent.putExtra("costos", tot)
            startActivity(intent)
            finishAffinity()
        }

        var bandera = 0
        var bandera2 = 0


        entrar.setOnClickListener(){
            nombre = name.text.toString()
            password = pass.text.toString()
          if(nombre != null && nombre != "") {
              if(nombre == "admin" || nombre == n){
                  bandera=1
              }else{
                  Toast.makeText(this, "Nombre invalido", Toast.LENGTH_LONG).show()}
          }else
          {Toast.makeText(this, "Agrega un nombre", Toast.LENGTH_LONG).show()}
            if(password != null && password != ""){
                if(password == "admin" || password == co){
                    bandera2=1
                }else{
                    Toast.makeText(this, "Contraseña invalida", Toast.LENGTH_LONG).show()}
            }else{
                Toast.makeText(this, "Agrega una contraseña", Toast.LENGTH_LONG).show()
            }
            if(bandera ==1 && bandera2 ==1){
                mal.setText("")
                onFinish()
            }else{mal.setText("Datos incorrectos")}
        }

        regis.setOnClickListener(){
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}