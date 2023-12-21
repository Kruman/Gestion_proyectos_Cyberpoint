package com.example.cyberpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ProgressBar
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var progressBar: ProgressBar
        progressBar = findViewById(R.id.pro)

        val timer = object: CountDownTimer(3000, 100) {

            override fun onTick(millisUntilFinished: Long) {
                val progress = ((3000 - millisUntilFinished) / 30).toInt()
                progressBar.progress = progress
            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity, Secion::class.java)
                startActivity(intent)
                finishAffinity()
            }
        }

        timer.start()
    }
}
