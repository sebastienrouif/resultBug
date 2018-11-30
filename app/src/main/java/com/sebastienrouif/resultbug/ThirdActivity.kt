package com.sebastienrouif.resultbug

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {

    override val tag: String = "ThirdActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        third_give_result.setOnClickListener {
            Log.e(tag, "Third giving result")
            setResult(Activity.RESULT_OK)
            finish()
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, ThirdActivity::class.java)
    }
}
