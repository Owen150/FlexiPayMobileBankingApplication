package com.example.uidesigns.dashboards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentAdditionalDetailsBinding
import com.example.uidesigns.databinding.FragmentDashboardSignInBinding

class SignInDashboard : Fragment() {
    private lateinit var _binding: FragmentDashboardSignInBinding
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDashboardSignInBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Action to buy airtime fragment
        binding.layoutAirtime.setOnClickListener {
            view.findNavController().navigate(R.id.action_signInDashboard_to_buyAirtimeFragment)
        }
        //Action to the ministatement fragment
        binding.ministatement.setOnClickListener{
            view.findNavController().navigate(R.id.action_signInDashboard_to_ministatementFragment)
        }
        //Hide account balance
        binding.hidebalance.setOnClickListener {
            view.findNavController().navigate(R.id.action_signInDashboard_to_hiddenAmountFragment)
        }
        //Action to invite friend fragment
        binding.invite.setOnClickListener {
            view.findNavController().navigate(R.id.action_signInDashboard_to_inviteFragment)
        }
        //Action to my accounts fragment
        binding.layoutMyAccounts.setOnClickListener {
            view.findNavController().navigate(R.id.action_signInDashboard_to_myAccountsFragment)
        }
    }
}