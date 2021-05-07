package com.pranav.raj.grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.pranav.raj.grid_module.ConnectionStatus

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connectionStatus = ConnectionStatus()

        if (!connectionStatus.isConnected(this)){
            Toast.makeText(this,"Network error",Toast.LENGTH_LONG).show()
        }
        else{
            Log.i(TAG, "onCreate: "+ "Connected")
        }
    }
}