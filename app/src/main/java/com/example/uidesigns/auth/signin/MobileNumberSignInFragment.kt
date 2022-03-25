package com.example.uidesigns.auth.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentMobileNumberBinding
import com.example.uidesigns.databinding.FragmentMobileNumberSignInBinding

class MobileNumberSignInFragment : Fragment() {

    private lateinit var _binding : FragmentMobileNumberSignInBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMobileNumberSignInBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btndash.setOnClickListener {
            view.findNavController().navigate(R.id.action_mobileNumberSignInFragment_to_signInDashboard)
        }
    }
}