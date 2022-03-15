package com.example.uidesigns.splashscreens

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.uidesigns.R
import com.example.uidesigns.onboarding.OnboardingScreenOneFragment
import kotlinx.coroutines.delay


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Set the Duration for the splash screen
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        },3000)
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }
}