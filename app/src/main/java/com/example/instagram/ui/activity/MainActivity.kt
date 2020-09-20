package com.example.instagram.ui.activity

import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.instagram.R
import com.example.instagram.ui.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.layout_bottom_navigation_view.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun setLayout() = R.layout.activity_main

    override fun setUpData() {
        setUpListeners()
//        addHomeFragment()
    }

    private fun setUpListeners() {
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val selectedFragment: Fragment

        when(item.itemId) {

            R.id.ic_home -> {
                selectedFragment =
                    HomeFragment()
            }

            R.id.ic_search -> {
                selectedFragment =
                    SearchFragment()
            }

            R.id.ic_share -> {
                selectedFragment =
                    ShareFragment()
            }

            R.id.ic_alert -> {
                selectedFragment =
                    LikesFragment()
            }

            R.id.ic_profile -> {
                selectedFragment =
                    ProfileFragment()
            }

            else -> throw IllegalArgumentException("Wrong ID!!")
        }

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, selectedFragment).commit()

        return true
    }
}