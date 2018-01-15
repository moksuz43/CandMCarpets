package com.example.moksu.candmcarpets.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.moksu.candmcarpets.R
import com.example.moksu.candmcarpets.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
