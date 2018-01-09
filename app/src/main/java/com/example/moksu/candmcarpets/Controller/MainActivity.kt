package com.example.moksu.candmcarpets.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.moksu.candmcarpets.Adapters.CategoryAdapter
import com.example.moksu.candmcarpets.Model.Category
import com.example.moksu.candmcarpets.R
import com.example.moksu.candmcarpets.Services.DateService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DateService.categories)
        categoryListView.adapter = adapter
    }
}
