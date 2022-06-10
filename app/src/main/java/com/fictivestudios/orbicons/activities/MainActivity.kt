package com.fictivestudios.orbicons.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.fictivestudios.orbicons.R

class MainActivity : AppCompatActivity() {

    var navHostFragment: NavHostFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*navHostFragment = supportFragmentManager.findFragmentById(R.id.fragHomeNavHost) as NavHostFragment
        navControllerHome = navHostFragment!!.navController
    */}



    companion object
    {
        lateinit var navControllerHome: NavController
        var homeact: MainActivity? = null

    }
}