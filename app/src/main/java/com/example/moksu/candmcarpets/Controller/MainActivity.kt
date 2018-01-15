package com.example.moksu.candmcarpets.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.moksu.candmcarpets.Adapters.CategoryAdapter
import com.example.moksu.candmcarpets.Adapters.CatergoryRecyleAdapter
import com.example.moksu.candmcarpets.Model.Category
import com.example.moksu.candmcarpets.R
import com.example.moksu.candmcarpets.Services.DateService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CatergoryRecyleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CatergoryRecyleAdapter(this, DateService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager (this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }
}
