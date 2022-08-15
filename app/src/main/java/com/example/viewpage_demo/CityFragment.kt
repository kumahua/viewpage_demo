package com.example.viewpage_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpage_demo.databinding.FragmentCityBinding

class CityFragment : Fragment() {

    private lateinit var v: FragmentCityBinding
    private lateinit var listener: BtnListener

    interface BtnListener {

        fun onBtnClick()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        v = FragmentCityBinding.inflate(layoutInflater)
        return v.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listener = activity as BtnListener

        v.btn.setOnClickListener {

            listener.onBtnClick()
        }
    }

//    fun setListener(listener: BtnListener): CityFragment {
//
//        this.listener = listener
//
//        return this
//    }
}