package com.example.moksu.candmcarpets.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.moksu.candmcarpets.Model.Category
import com.example.moksu.candmcarpets.R
import com.example.moksu.candmcarpets.R.id.categoryname

/**
 * Created by moksu on 09/01/2018.
 */
class CategoryAdapter (val context: Context, val categories: List<Category>) : BaseAdapter ( ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        if ( convertView == null) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.categorylistitem, null)
            holder = ViewHolder()


            holder.categoryImage = categoryView.findViewById(R.id.categoryimage)
            holder.categoryname = categoryView.findViewById(R.id.categoryname)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category = categories [position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        println(resourceId)

        holder.categoryname?.text = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories [position]
    }

    override fun getItemId(position: Int): Long {
return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private  class ViewHolder {

        var  categoryImage: ImageView? = null
        var categoryname: TextView? = null
    }

}