package com.fictivestudios.orbicons.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fictivestudios.imdfitness.activities.fragments.BaseFragment
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.adapters.LauncherAdapter
import com.fictivestudios.orbicons.models.Launcher
import com.fictivestudios.orbicons.utils.Titlebar
import com.fictivestudios.orbicons.utils.isPackageInstalled
import kotlinx.android.synthetic.main.fragment_installed_luancher.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InstalledLuancherFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InstalledLuancherFragment : BaseFragment() {
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
        titlebar.setMainTitle("APPLY",object:View.OnClickListener{
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

        mView = inflater.inflate(R.layout.fragment_installed_luancher, container, false)


        setLaunchersList()


        return mView
    }

    private fun setLaunchersList() {
        var launcherList =ArrayList<Launcher>()

        var installedLauncher = ArrayList<Launcher>()
        var supportedLauncher = ArrayList<Launcher>()

        launcherList.clear()
        installedLauncher.clear()
        supportedLauncher.clear()

        launcherList.add(Launcher("Apex","com.anddoes.launcher",R.mipmap.icon_apex))
        launcherList.add(Launcher("Nova","com.teslacoilsw.launcher",R.mipmap.icon_nova))
        launcherList.add(Launcher("Next","com.gtp.nextlauncher",R.mipmap.icon_next))
         launcherList.add(Launcher("Holo","com.mobint.hololauncher",R.mipmap.icon_holo))
         launcherList.add(Launcher("Go","com.gau.go.launcherex",R.mipmap.icon_go))
         launcherList.add(Launcher("ADW","org.adw.launcher",R.mipmap.icon_adw  ))

        for (launcher in launcherList)
        {
            if (isPackageInstalled(launcher.package_,requireContext()))
            {
                installedLauncher.add(launcher)
            }
            else
            {
                supportedLauncher.add(launcher)
            }
        }

        mView.rv_installed_launcher.adapter = LauncherAdapter(requireContext(),installedLauncher)
        mView.rv_installed_launcher.adapter?.notifyDataSetChanged()


        mView.rv_installed_supported.adapter = LauncherAdapter(requireContext(),supportedLauncher)
        mView.rv_installed_supported.adapter?.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment InstalledLuancherFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InstalledLuancherFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}