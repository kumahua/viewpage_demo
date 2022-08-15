package com.example.viewpage_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpage_demo.databinding.FragmentCountryBinding

class CountryFragment : Fragment() {

    private lateinit var v: FragmentCountryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        v = FragmentCountryBinding.inflate(layoutInflater)
        return v.root
    }
}