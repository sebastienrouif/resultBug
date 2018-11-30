package com.sebastienrouif.resultbug

import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override val tag: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_start_transparent.setOnClickListener {
            startActivityForResult(TransparentActivity.newIntent(this), TRANSPARENT_RESULT)
        }
        main_start_not_transparent.setOnClickListener {
            startActivityForResult(NotTransparentActivity.newIntent(this), NOT_TRANSPARENT_RESULT)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            TRANSPARENT_RESULT -> {
                Log.e(tag,"TRANSPARENT_RESULT ${resultCode.toActivityResult()}")
            }
            NOT_TRANSPARENT_RESULT -> {
                Log.e(tag,"NOT_TRANSPARENT_RESULT ${resultCode.toActivityResult()}")
            }
        }
    }

    companion object {
        private const val TRANSPARENT_RESULT = 1001
        private const val NOT_TRANSPARENT_RESULT = 1002
    }
}
