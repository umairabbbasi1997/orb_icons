package com.fictivestudios.imdfitness.activities.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.fictivestudios.orbicons.activities.MainActivity
import com.fictivestudios.orbicons.activities.MainActivity2
import com.fictivestudios.orbicons.utils.Titlebar

abstract class BaseFragment : Fragment() {

    var getActivityContext: MainActivity2? = null
  //  var getHomeContext: HomeActivity? = null
//    var getSplashContext: SplashActivity? = null
    //var preferenceHelper: BasePreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*
        setPreferenceHelper()
        setHomePreferenceHelper()*/
    }

    abstract fun setTitlebar(titlebar: Titlebar)

  //  abstract fun setHomeTitlebar(titlebar: TitlebarMain)

    fun getActivityContext(): Activity? {
        return getActivityContext
    }


 /*   fun setPreferenceHelper() {
        if (preferenceHelper == null) {
            preferenceHelper = BasePreferenceHelper(getActivityContext)
        }
    }

    fun setHomePreferenceHelper() {
        if (preferenceHelper == null) {
            preferenceHelper = BasePreferenceHelper(getHomeContext)
        }
    }
*/
//    fun setSplashPreferenceHelper() {
//        if (preferenceHelper == null) {
//            preferenceHelper = BasePreferenceHelper(getSplashContext)
//        }
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity2) {
            val contex = context as MainActivity2?
            if (contex != null)
                getActivityContext = context
        }
     /*   else if(context is HomeActivity)
        {
            val contex = context as HomeActivity?
            if (contex != null)
                getHomeContext = context
        }*/
//        else
//        {
//            val contex = context as SplashActivity?
//            if (contex != null)
//                getSplashContext = context
//        }
    }

    override fun onResume() {
        super.onResume()
        if (getActivityContext != null) {
            setTitlebar(getActivityContext!!.getTitlebar())
        }


    }




}
