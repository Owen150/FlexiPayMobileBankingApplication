package com.example.uidesigns.onboarding.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.databinding.FragmentAdditionalDetailsBinding
import com.example.uidesigns.databinding.FragmentViewPagerBinding
import com.example.uidesigns.onboarding.OnboardingScreenOneFragment
import com.example.uidesigns.onboarding.OnboardingScreenThreeFragment
import com.example.uidesigns.onboarding.OnboardingScreenTwoFragment


class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentList = arrayListOf<Fragment>(
            OnboardingScreenOneFragment(onclick = {navigateToOnboarding()}),
            OnboardingScreenTwoFragment(onclick = {navigateToOnboarding()}),
            OnboardingScreenThreeFragment(onclick = {navigateToOnboarding()})
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter
    }



    fun navigateToOnboarding(){
        findNavController().navigate(R.id.action_viewPagerFragment_to_mobileNumberFragment)
    }
}