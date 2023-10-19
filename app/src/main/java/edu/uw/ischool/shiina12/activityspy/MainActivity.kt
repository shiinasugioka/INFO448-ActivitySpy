package edu.uw.ischool.shiina12.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired with params: $savedInstanceState")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }

    public override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    public override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    public override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    public override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }
}