package com.example.firstgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_start_page.*

class StartPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)
    }

    fun StartGame(view: View) {
        val button=findViewById<Button>(R.id.startid)
        button.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
