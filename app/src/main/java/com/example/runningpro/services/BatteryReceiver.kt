package com.example.runningpro.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BatteryReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context, "Please charge your phone for a good running", Toast.LENGTH_SHORT).show()
    }
}