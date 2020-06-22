package com.example.week4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.week4.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container,false)

        binding.buttonRed.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_redFragment)
        )
        binding.buttonOrange.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_orangeFragment))
        binding.buttonYellow.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_yellowFragment))

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}