package com.fictivestudios.orbicons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.fictivestudios.imdfitness.activities.fragments.BaseFragment
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.adapters.ViewPagerIcons
import com.fictivestudios.orbicons.utils.Titlebar
import kotlinx.android.synthetic.main.fragment_icons.*
import kotlinx.android.synthetic.main.fragment_icons.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [IconsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class IconsFragment : BaseFragment() {
    private var isAllClick: Boolean = false
    private var isGoogleClick: Boolean = false
    private var isAnythingClick: Boolean = false
    private var isMarbleClick: Boolean = false
    private var isSystemClick: Boolean = false

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var mView: View



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun setTitlebar(titlebar: Titlebar) {
        titlebar.setMainTitle("ICONS",object:View.OnClickListener{
            override fun onClick(p0: View?) {
                getActivityContext?.openDrawer()
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_icons, container, false)

        setListeners()

        setViewPager()

        return mView
    }

    private fun setListeners() {
            mView.tv_all.setOnClickListener {

            if(!isAllClick)
            {
                isAllClick = true

                isGoogleClick = false
                isAnythingClick=false
                isMarbleClick = false
                isSystemClick=false

                mView.tv_all.setBackgroundResource(R.drawable.round_gray_bg)
                mView.tv_google.setBackgroundResource(R.color.transparent)
                mView.tv_anything.setBackgroundResource(R.color.transparent)
                mView.tv_marble.setBackgroundResource(R.color.transparent)
                mView.tv_system.setBackgroundResource(R.color.transparent)
                mView.view_pager_icons.setCurrentItem(0,true)

            }





        }

        mView.tv_google.setOnClickListener {

            if(!isGoogleClick)
            {
                isGoogleClick = true

                isAllClick = false
                isAnythingClick = false
                isMarbleClick = false
                isSystemClick=false
                mView.tv_google.setBackgroundResource(R.drawable.round_gray_bg)
                mView.tv_all.setBackgroundResource(R.color.transparent)
                mView.tv_anything.setBackgroundResource(R.color.transparent)
                mView.tv_marble.setBackgroundResource(R.color.transparent)
                mView.tv_system.setBackgroundResource(R.color.transparent)
                mView.view_pager_icons.setCurrentItem(1,true)

            }



        }

        mView.tv_anything.setOnClickListener {

            if (!isAnythingClick) {
                isAnythingClick = true

                isGoogleClick = false
                isAllClick = false
                isMarbleClick = false
                isSystemClick = false

                mView.tv_anything.setBackgroundResource(R.drawable.round_gray_bg)
                mView.tv_google.setBackgroundResource(R.color.transparent)
                mView.tv_all.setBackgroundResource(R.color.transparent)
                mView.tv_marble.setBackgroundResource(R.color.transparent)
                mView.tv_system.setBackgroundResource(R.color.transparent)
                mView.view_pager_icons.setCurrentItem(2, true)

            }

            mView.tv_marble.setOnClickListener {

                if (!isMarbleClick) {
                    isMarbleClick = true

                    isAnythingClick = false
                    isGoogleClick = false
                    isAllClick = false
                    isSystemClick = false

                    mView.tv_marble.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_system.setBackgroundResource(R.color.transparent)
                    mView.view_pager_icons.setCurrentItem(3, true)
                }
            }

            mView.tv_system.setOnClickListener {
                if (!isSystemClick) {

                    isSystemClick = true

                    isAnythingClick = false
                    isGoogleClick = false
                    isAllClick = false
                    isMarbleClick = false


                    mView.tv_system.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_marble.setBackgroundResource(R.color.transparent)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                    mView.view_pager_icons.setCurrentItem(4, true)
                }
            }
        }

    }

    private fun setViewPager() {
        var adapter = ViewPagerIcons(childFragmentManager)
        mView.view_pager_icons.adapter = adapter




        mView.view_pager_icons.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(position: Int, positionOffset: Float,
                                        positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {

                if (position == 0)
                {
                    mView.scroll_view.smoothScrollTo(0,0)

                    isAllClick = true

                    isGoogleClick = false
                    isAnythingClick=false
                    isMarbleClick = false
                    isSystemClick=false

                    mView.tv_all.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                    mView.tv_marble.setBackgroundResource(R.color.transparent)
                    mView.tv_system.setBackgroundResource(R.color.transparent)

                }
                else if (position == 1)
                {
                    mView.scroll_view.smoothScrollTo(0,0)

                    isGoogleClick = true

                    isAllClick = false
                    isAnythingClick = false
                    isMarbleClick = false
                    isSystemClick=false
                    mView.tv_google.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                    mView.tv_marble.setBackgroundResource(R.color.transparent)
                    mView.tv_system.setBackgroundResource(R.color.transparent)


                }
                else if (position == 2)
                {
                    isAnythingClick = true

                    isGoogleClick = false
                    isAllClick = false
                    isMarbleClick = false
                    isSystemClick=false

                    mView.tv_anything.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_marble.setBackgroundResource(R.color.transparent)
                    mView.tv_system.setBackgroundResource(R.color.transparent)
                }

                else if (position == 3)
                {
                    mView.scroll_view.smoothScrollTo(mView.scroll_view.getChildAt(0).width,  0)

                    isMarbleClick = true

                    isAnythingClick = false
                    isGoogleClick = false
                    isAllClick = false
                    isSystemClick=false

                    mView.tv_marble.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_system.setBackgroundResource(R.color.transparent)
                }

                else if (position == 4)
                {
//                    mView.scroll_view.scrollX=View.FOCUS_DOWN

                    mView.scroll_view.smoothScrollTo(mView.scroll_view.getChildAt(0).width,  0)

                    isSystemClick = true

                    isAnythingClick = false
                    isGoogleClick = false
                    isAllClick = false
                    isMarbleClick = false


                    mView.tv_system.setBackgroundResource(R.drawable.round_gray_bg)
                    mView.tv_google.setBackgroundResource(R.color.transparent)
                    mView.tv_all.setBackgroundResource(R.color.transparent)
                    mView.tv_marble.setBackgroundResource(R.color.transparent)
                    mView.tv_anything.setBackgroundResource(R.color.transparent)
                }
            }
            override fun onPageScrollStateChanged(state: Int) {}
        })







    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment IconsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            IconsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}