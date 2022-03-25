package com.example.uidesigns.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentInviteBinding
import com.example.uidesigns.databinding.FragmentInviteShowBalanceBinding


class InviteShowBalanceFragment : Fragment() {

    private lateinit var _binding : FragmentInviteShowBalanceBinding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInviteShowBalanceBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ministatement.setOnClickListener {
            view.findNavController().navigate(R.id.action_inviteShowBalanceFragment_to_ministatementFragment)
        }
        binding.hidebalance.setOnClickListener {
            view.findNavController().navigate(R.id.action_inviteShowBalanceFragment_to_inviteFragment)
        }
    }
}