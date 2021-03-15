package com.example.testtask.secondscreen

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.testtask.R

class GameAdapter( var context: Context, var arrayList: ArrayList<GameItem>) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
       return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.card_view_item_grid,null)
        var icons:ImageView = view.findViewById(R.id.icons)
        var names: TextView = view.findViewById(R.id.name_test_view)

        var listItem: GameItem = arrayList[position]

        icons.setImageResource(listItem.icons!!)
        names.text = listItem.name

        return view
    }
}