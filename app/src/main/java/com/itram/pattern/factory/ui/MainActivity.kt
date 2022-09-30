package com.itram.pattern.factory.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.itram.pattern.factory.R
import com.itram.pattern.factory.domain.ValidatorFactory

class MainActivity : AppCompatActivity() {

    private val TAG = "FactoryPattern"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val validator = ValidatorFactory().getValidator("00000000R")
        if (validator?.validate() == true) {
            Log.d(TAG, "The document is correct")
        } else {
            Log.d(TAG, "The document is incorrect")
        }

    }
}