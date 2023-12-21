package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val name=findViewById<EditText>(R.id.nom)
        val pass=findViewById<EditText>(R.id.pas)
        val pass2=findViewById<EditText>(R.id.pas2)
        val registro = findViewById<Button>(R.id.regis)
        val alert=findViewById<TextView>(R.id.alert)


        registro.setOnClickListener(){
            var nam=""
            var pa =""
            var contra =pass.text.toString()
            var contra2 =pass2.text.toString()

            if (contra == contra2){
                nam= name.toString()
                pa=pass.toString()
                Toast.makeText(this, "Nuevo Registro", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Secion::class.java)
                intent.putExtra("nombre", nam)
                intent.putExtra("contraseña",pa)
                startActivity(intent)
                finishAffinity()
            }else{alert.setText("Las contraseñas no conciden")}

        }
    }
}