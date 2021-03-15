package com.example.testtask.thirdscreen.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.thirdscreen.players.RecyclerAdapter

class GalleryFragment : Fragment() {

    private var pictureList = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_gallery, container, false)

        val rv = v.findViewById<RecyclerView>(R.id.g_recyclerview)
        rv.layoutManager = LinearLayoutManager(this.activity)

        rv.adapter = GalleryAdapter(pictureList)

        postToList()
        return v
    }

    private fun addToList(image: Int){
        pictureList.add(image)
    }

    private fun postToList(){
        for (i in 1..15){
            addToList(R.mipmap.ic_launcher_round )
        }
    }
}