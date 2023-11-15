package com.example.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcast: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val actions = intent?.action
        Toast.makeText(context, "action: ${actions}", Toast.LENGTH_SHORT).show()
        // Handle the received data here
        val data = intent!!.getStringExtra("KeyName")
        Toast.makeText(context, "Data Received from External App: $data", Toast.LENGTH_LONG).show()

    }
}