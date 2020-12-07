package com.example.tap_the_koala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun StartEasy(view: View) {
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent= Intent(this,easy::class.java)
            startActivity(intent)
        }
    }
    fun StartMedium(view: View) {
        val button=findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent= Intent(this,medium::class.java)
            startActivity(intent)
        }
    }
    fun StartHard(view: View) {
        val button=findViewById<Button>(R.id.button3)
        button.setOnClickListener{
            val intent= Intent(this,hard::class.java)
            startActivity(intent)
        }
    }

}