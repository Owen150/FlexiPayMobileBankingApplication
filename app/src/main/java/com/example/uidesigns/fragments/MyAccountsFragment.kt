package com.example.uidesigns.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentInviteBinding
import com.example.uidesigns.databinding.FragmentMyAccountsBinding

class MyAccountsFragment : Fragment() {

    private lateinit var binding : FragmentMyAccountsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMyAccountsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvmini.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_ministatementFragment)
        }
        binding.minione.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_ministatementFragment)
        }
        binding.minitwo.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_ministatementFragment)
        }
        binding.fullstatement.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_fullStatementFragment)
        }
        binding.fullone.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_fullStatementFragment)
        }
        binding.fulltwo.setOnClickListener {
            view.findNavController().navigate(R.id.action_myAccountsFragment_to_fullStatementFragment)
        }
    }
}