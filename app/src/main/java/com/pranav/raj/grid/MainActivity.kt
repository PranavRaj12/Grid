package com.pranav.raj.grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.textview.MaterialTextView
import com.pranav.raj.grid_module.ConnectionStatus


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val status = findViewById<MaterialTextView>(R.id.statusText) as MaterialTextView

            val connectionStatus = ConnectionStatus()
            if (!connectionStatus.isConnected(this)){
                status.setText("Network Error!")
            }
            else{
                status.setText("Connected.")
            }
    }
}