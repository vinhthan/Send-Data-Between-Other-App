package com.example.senddatabetweenotherapp

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.btn_send)
        tv = findViewById<TextView>(R.id.tv1)
        btnSend.setOnClickListener {
            val intent = Intent()
            intent.action = "com.vinhtm1"
            intent.putExtra("KeyName", "value vinhtm1")
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            intent.component = ComponentName("com.example.receiverapp", "com.example.receiverapp.MyBroadcast")
            sendBroadcast(intent)

        }


    }


}