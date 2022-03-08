package com.example.uidesigns.onboarding.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uidesigns.R
import com.example.uidesigns.onboarding.OnboardingScreenOneFragment
import com.example.uidesigns.onboarding.OnboardingScreenThreeFragment
import com.example.uidesigns.onboarding.OnboardingScreenTwoFragment


class ViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            OnboardingScreenOneFragment(),
            OnboardingScreenTwoFragment(),
            OnboardingScreenThreeFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewPager.adapter = adapter
        return view
    }
}