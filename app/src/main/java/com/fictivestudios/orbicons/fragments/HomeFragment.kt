package com.fictivestudios.orbicons.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fictivestudios.imdfitness.activities.fragments.BaseFragment
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.adapters.ViewPagerIcons
import com.fictivestudios.orbicons.adapters.ViewPagerSlider
import com.fictivestudios.orbicons.utils.Titlebar
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_icons.view.*
import kotlinx.android.synthetic.main.fragment_icons.view.view_pager_icons

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : BaseFragment() {
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
        titlebar.setMainTitle("HOME",object:View.OnClickListener{
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

        mView = inflater.inflate(R.layout.fragment_home, container, false)

        mView.iv_share.setOnClickListener {

            share()
        }

        setViewPager()

        return mView
    }

    private fun setViewPager()
    {

        var adapter = ViewPagerSlider(childFragmentManager)
        mView.view_pager_slider.adapter = adapter

        mView.dots_indicator.setViewPager(mView.view_pager_slider);
    }

    private fun share()
    {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        val shareBody = "abcd"
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "App link")
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody)
        startActivity(Intent.createChooser(sharingIntent, "Share App Link Via :"))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}