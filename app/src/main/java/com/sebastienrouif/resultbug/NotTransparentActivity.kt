package com.sebastienrouif.resultbug

import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_not_transparent.*

class NotTransparentActivity : BaseActivity() {

    override val tag: String = "NotTransparentActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_transparent)
        not_transparent_start_third.setOnClickListener {
            startActivityForResult(ThirdActivity.newIntent(this), THIRD_RESULT)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            THIRD_RESULT -> {
                setResult(resultCode)
                finish()
            }
        }
    }

    companion object {
        private const val THIRD_RESULT = 1004
        fun newIntent(context: Context) = Intent(context, NotTransparentActivity::class.java)
    }
}
