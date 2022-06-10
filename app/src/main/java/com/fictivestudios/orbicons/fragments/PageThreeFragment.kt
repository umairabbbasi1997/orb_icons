package com.fictivestudios.orbicons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.adapters.AlliconsAdapter
import com.fictivestudios.orbicons.utils.pageOneIconsList
import com.fictivestudios.orbicons.utils.pageThreeIconsList
import kotlinx.android.synthetic.main.fragment_page_one.view.*
import kotlinx.android.synthetic.main.fragment_page_one.view.rv_page1_icons
import kotlinx.android.synthetic.main.fragment_page_three.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PageThreeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PageThreeFragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_page_three, container, false)

        setRecyclerView()

        return mView
    }

    private fun setRecyclerView() {

        mView.rv_page3_icons.adapter = context?.let { AlliconsAdapter(it, pageThreeIconsList) }
        mView.rv_page3_icons.adapter?.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PageThreeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PageThreeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}