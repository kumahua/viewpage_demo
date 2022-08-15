package com.example.viewpage_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpage_demo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), CityFragment.BtnListener {

    private lateinit var v: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        v = ActivityMainBinding.inflate(layoutInflater)
        setContentView(v.root)

        val pageAdapter = PageAdapter(supportFragmentManager, lifecycle)
        v.viewPager2.adapter = pageAdapter

        val title: ArrayList<String> = arrayListOf("熱門城市", "全部目的地")
        TabLayoutMediator(v.tabLayout, v.viewPager2) { tab, position ->

            tab.text = title[position]
        }.attach()
    }

    override fun onBtnClick() {

        v.viewPager2.currentItem += 1
    }
}