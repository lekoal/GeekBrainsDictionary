package com.example.geekbrainsdictionary.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.geekbrainsdictionary.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {

    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainScreenBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance() = MainScreenFragment()
    }
}