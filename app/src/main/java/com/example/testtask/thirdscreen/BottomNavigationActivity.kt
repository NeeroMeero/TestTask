package com.example.testtask.thirdscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.testtask.R
import com.example.testtask.thirdscreen.gallery.GalleryFragment
import com.example.testtask.thirdscreen.players.PlayersFragment
import com.example.testtask.thirdscreen.rules.RulesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        var intent = intent
        //val name = intent.getStringExtra()

        val rulesFragment = RulesFragment()
        val playersFragment = PlayersFragment()
        val galleryFragment = GalleryFragment()

        makeCurrentFragment(rulesFragment)

        val bottomNavigationView = findViewById <BottomNavigationView> (R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_rules -> makeCurrentFragment(rulesFragment)
                R.id.ic_players -> makeCurrentFragment(playersFragment)
                R.id.ic_gallery -> makeCurrentFragment(galleryFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) = supportFragmentManager
        .beginTransaction().apply {
            replace(R.id.wrapper, fragment)
            commit()
        }
}