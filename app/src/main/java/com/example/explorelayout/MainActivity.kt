package com.example.explorelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
    }

    fun loadLinearLayout(v: View) {
        setContentView(R.layout.linear_layout)
    }

    fun loadConstraintLayout(v: View) {
        setContentView(R.layout.activity_main)
    }

    fun loadTableLayout(v: View) {
        setContentView(R.layout.table_layout)
    }
}