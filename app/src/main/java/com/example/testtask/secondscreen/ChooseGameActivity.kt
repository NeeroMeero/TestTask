package com.example.testtask.secondscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.testtask.thirdscreen.BottomNavigationActivity
import com.example.testtask.R

class ChooseGameActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var arrayList: ArrayList<GameItem>? = null
    private var gridView: GridView? = null
    private var gameAdapter: GameAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.item_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        gameAdapter = GameAdapter(applicationContext,arrayList!!)
        gridView?.adapter = gameAdapter
        gridView?.onItemClickListener = this

    }

    private fun setDataList(): ArrayList<GameItem>{

        val arrayList: ArrayList<GameItem> = ArrayList()
        arrayList.add(GameItem(R.drawable.basketball, "Basketball"))
        arrayList.add(GameItem(R.drawable.soccer, "Football"))
        arrayList.add(GameItem(R.drawable.ping_pong, "Tennis"))
        arrayList.add(GameItem(R.drawable.handball, "Handball"))
        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: GameItem = arrayList!![position]
        val intent = Intent(this@ChooseGameActivity, BottomNavigationActivity::class.java)
        //intent.putExtra("id", id)
        startActivity(intent)

        //Toast.makeText(applicationContext, id.toString(), Toast.LENGTH_LONG).show()
    }
}