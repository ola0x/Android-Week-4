package com.example.week4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week4.databinding.FragmentOrangeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [OrangeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrangeFragment : Fragment() {

    private lateinit var binding: FragmentOrangeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentOrangeBinding.inflate(inflater,container,false)

        binding.predictedText.setText(getText(R.string.orange_text))

        return binding.root

    }

}