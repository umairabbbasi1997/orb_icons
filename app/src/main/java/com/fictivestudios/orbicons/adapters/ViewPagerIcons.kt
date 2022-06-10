package com.fictivestudios.orbicons.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.fictivestudios.orbicons.fragments.*

class ViewPagerIcons (fm: FragmentManager) : FragmentPagerAdapter(fm)  {

    val fm = fm
    override fun getCount(): Int {
        return 5;
    }



    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return AlliconsFragment()
            }
            1 -> {
                return GoogleIconsFragment()
            }
            2 -> {
                return AnythingIconsFragment()
            }
            3 -> {
                return MarbleIconsFragment()
            }
            4 -> {
                return SystemIconsFragment()
            }
            else -> {
                return AlliconsFragment()
            }
        }
    }





}