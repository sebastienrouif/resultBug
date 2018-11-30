package com.sebastienrouif.resultbug

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log


abstract class BaseActivity : AppCompatActivity() {

    abstract val tag : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume")
    }

    override fun onPause() {
        Log.i(tag, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(tag, "onDestroy")
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.w(tag, "requestCode $requestCode resultCode $resultCode")
    }
}