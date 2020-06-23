package com.example.week4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week4.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {
    private lateinit var binding: FragmentRulesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentRulesBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
}
