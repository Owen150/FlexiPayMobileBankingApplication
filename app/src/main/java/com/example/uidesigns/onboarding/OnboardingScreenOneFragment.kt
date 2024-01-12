package com.example.uidesigns.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uidesigns.databinding.FragmentOnboardingScreenOneBinding

class OnboardingScreenOneFragment(val onclick : () -> Unit) : Fragment() {

    private var _binding: FragmentOnboardingScreenOneBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentOnboardingScreenOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRegisterOne.setOnClickListener{
            onclick.invoke()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}