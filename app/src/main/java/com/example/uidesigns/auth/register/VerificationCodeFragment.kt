package com.example.uidesigns.auth.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentDocumentPhotoBinding
import com.example.uidesigns.databinding.FragmentPersonalInfoBinding
import com.example.uidesigns.databinding.FragmentVerificationCodeBinding

class VerificationCodeFragment : Fragment() {
    private var _binding: FragmentVerificationCodeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVerificationCodeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRegisterOne.setOnClickListener {
            view.findNavController().navigate(R.id.action_verificationCodeFragment_to_enterPinFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}