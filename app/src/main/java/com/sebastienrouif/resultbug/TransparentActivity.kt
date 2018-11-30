package com.sebastienrouif.resultbug

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_transparent.*

class TransparentActivity : BaseActivity() {

    override val tag: String = "TransparentActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent)
        transparent_start_third.setOnClickListener {
            startActivityForResult(ThirdActivity.newIntent(this), THIRD_RESULT)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            THIRD_RESULT -> {
                Log.e(tag, "TransparentActivity giving result ${resultCode.toActivityResult()}")
                setResult(resultCode)
                finish()
            }
        }
    }

    companion object {
        private const val THIRD_RESULT = 1003
        fun newIntent(context: Context) = Intent(context, TransparentActivity::class.java)
    }
}
