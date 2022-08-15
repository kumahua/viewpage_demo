package com.example.viewpage_demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments: ArrayList<Fragment> = arrayListOf(CityFragment(), CountryFragment())

    override fun getItemCount(): Int {

        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {

        return fragments[position]
    }
}