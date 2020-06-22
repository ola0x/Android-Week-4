package com.example.week4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week4.databinding.FragmentYellowBinding

/**
 * A simple [Fragment] subclass.
 * Use the [YellowFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class YellowFragment : Fragment() {

    private lateinit var binding: FragmentYellowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentYellowBinding.inflate(inflater,container,false)
        binding.predictedText.setText(getText(R.string.yellow_text))

        return binding.root
    }

}