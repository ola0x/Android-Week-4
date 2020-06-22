package com.example.week4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week4.databinding.FragmentRedBinding

/**
 * A simple [Fragment] subclass.
 * Use the [RedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RedFragment : Fragment() {

    private lateinit var binding: FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRedBinding.inflate(inflater,container,false)
        binding.predictedText.setText(getText(R.string.red_text))

        return binding.root
    }

}