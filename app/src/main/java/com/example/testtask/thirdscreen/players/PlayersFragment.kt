package com.example.testtask.thirdscreen.players

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R

class PlayersFragment : Fragment() {


    //private var listPlayers = mutableListOf<PlayerItem>()

    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v = inflater.inflate(R.layout.fragment_players, container, false)

        val rv = v.findViewById<RecyclerView>(R.id.rv_recyclerview)
        rv.layoutManager = LinearLayoutManager(this.activity)

        rv.adapter = RecyclerAdapter(titleList,descList,imagesList)

        postToList()
        return v
    }

    private fun addToList(title: String, description: String, image: Int){
        titleList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList(){
        for (i in 1..15){
            addToList("Name $i", "Sport $i", R.mipmap.ic_launcher_round )
        }
    }
}