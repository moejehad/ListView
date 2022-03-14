package com.example.androidass6.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.androidass6.R
import com.example.androidass6.model.Recipes
import kotlinx.android.synthetic.main.list_item.view.*

class RecipesAdapter(var activity: Activity, var data:ArrayList<Recipes>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var root = p1
        if (root == null)
            root = LayoutInflater.from(activity).inflate(R.layout.list_item,null,false)

        root!!.imageView.setImageResource(data[p0].img)
        root!!.title.text = data[p0].title
        root!!.desc.text = data[p0].desc
        root!!.number.text = data[p0].id.toString()

        return root
    }

    override fun getItem(p0: Int): Any {
        return data[p0]
    }

    override fun getItemId(p0: Int): Long {
        return data[p0].id.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }
}