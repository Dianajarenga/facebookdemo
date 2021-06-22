package com.example.facebookdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        nextActivity()
    }
    lateinit var btnlog:Button
    lateinit var btnsign:Button
    fun castView(){
        btnlog=findViewById<Button>(R.id.btnlog)
        btnsign=findViewById<Button>(R.id.btnsign)
    }

    fun nextActivity(){
        btnlog.setOnClickListener{
            val next=Intent(baseContext,MainActivity2::class.java)
            startActivity(next)}
        btnsign.setOnClickListener {
            val next2 = Intent(baseContext, MainActivity3::class.java)
            startActivity(next2)
        }
    }
}
