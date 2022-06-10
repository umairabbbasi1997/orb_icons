package com.fictivestudios.orbicons.adapters

import androidx.viewpager.widget.ViewPager

import android.view.ViewGroup

import android.R
import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.fictivestudios.orbicons.fragments.*


class ViewPagerSlider(fm: FragmentManager) : FragmentPagerAdapter(fm)  {

    val fm = fm

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return PageOneFragment()
            }
            1 -> {
                return PageTwoFragment()
            }
            2 -> {
                return PageThreeFragment()
            }

            else -> {
                return PageOneFragment()
            }
        }
    }


}