package com.pranav.raj.grid_module

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.util.Log

private const val TAG = "ConnectionStatus"
public class ConnectionStatus {

    public fun isConnected(context: Context) : Boolean{

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val connected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        return if (connected){
            Log.i(TAG, "hasConnection: " + "TRUE")
            true

        } else{
            Log.i(TAG, "hasConnection: " + "FALSE")
            false

        }
    }
}