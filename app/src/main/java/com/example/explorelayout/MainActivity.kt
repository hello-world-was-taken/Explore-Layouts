package com.example.explorelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
    }

    fun linearLayout(v: View) {
        setContentView(R.layout.linear_layout)
    }

    fun loadConstraintLayout(v: View) {
        setContentView(R.layout.activity_main)
    }

    fun loadTableLayout(v: View) {
        setContentView(R.layout.table_view)
    }
}