package com.ulisesdiaz.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var viewPager: ViewPager? = null
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabs)

        setupViewPager()
        tabLayout?.setupWithViewPager(viewPager)
        setupIconos()
    }

    fun setupIconos(){
        tabLayout?.getTabAt(0)!!.setIcon(R.drawable.ic_01)
        tabLayout?.getTabAt(1)!!.setIcon(R.drawable.ic_2)
        tabLayout?.getTabAt(2)!!.setIcon(R.drawable.ic_3)
    }

    fun setupViewPager(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PrimeroFragment(), "Fragmento 1")
        adapter.addFragment(PrimeroFragment(), "Fragmento 2")
        adapter.addFragment(PrimeroFragment(), "Fragmento 3")

        viewPager?.adapter = adapter

    }
}