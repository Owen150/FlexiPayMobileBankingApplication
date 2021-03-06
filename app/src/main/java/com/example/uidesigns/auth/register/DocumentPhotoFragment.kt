package com.example.uidesigns.auth.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentAdditionalDetailsBinding
import com.example.uidesigns.databinding.FragmentDocumentPhotoBinding

class DocumentPhotoFragment : Fragment() {
    private var _binding: FragmentDocumentPhotoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDocumentPhotoBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRegisterOne.setOnClickListener {
            view.findNavController().navigate(R.id.action_documentPhotoFragment_to_verificationCodeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}