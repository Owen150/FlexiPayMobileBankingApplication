package com.example.uidesigns.dashboards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentDashboardSignInBinding
import com.example.uidesigns.databinding.FragmentHiddenAmountBinding

class HiddenAmountFragment : Fragment() {

    private lateinit var _binding: FragmentHiddenAmountBinding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHiddenAmountBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.showbalance.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_signInDashboard)
        }
        //Action to ministatement fragment
        binding.ministatement.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_ministatementFragment)
        }
        //Action to buy airtime fragment
        binding.layoutAirtime.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_buyAirtimeFragment)
        }
        //Action to invite friend fragment
        binding.invite.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_inviteFragment)
        }
        //Action to my accounts fragment
        binding.layoutMyAccounts.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_myAccountsFragment)
        }
        //Action to pay bills fragment
        binding.layoutPayBills.setOnClickListener {
            view.findNavController().navigate(R.id.action_hiddenAmountFragment_to_payBillsFragment)
        }
    }
}