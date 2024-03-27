package com.android.indicator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.android.indicator.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            introViewPager.adapter = OnboardingAdapter()
            introViewPager.setPageTransformer(ZoomOutPageTransformer())
            //intoTabLayout.tabMode = TabLayout.MODE_SCROLLABLE;
            TabLayoutMediator(intoTabLayout, introViewPager) { tab, position -> }.attach() //The Magical Line

        }
    }


}