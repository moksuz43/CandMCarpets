package com.example.moksu.candmcarpets.Adapters

import android.content.Context
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.moksu.candmcarpets.Model.Category
import com.example.moksu.candmcarpets.R

/**
 * Created by moksu on 12/01/2018.
 */
class CatergoryRecyleAdapter (val context: Context, val category: List<Category>) : RecyclerView.Adapter <CatergoryRecyleAdapter.Holder>() {
    override fun onBindViewHolder(holder: Holder?, position: Int) {

        holder?.bindCategory(category[position], context)

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.categorylistitem, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return  category.count()
    }


    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryimage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryname)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

}