package com.fictivestudios.orbicons.activities

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.fictivestudios.orbicons.R

import com.fictivestudios.orbicons.databinding.ActivityMain2Binding
import com.fictivestudios.orbicons.fragments.*
import com.fictivestudios.orbicons.utils.Titlebar
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity2 : BaseActivity() {


    private lateinit var mDrawer: DrawerLayout
    // private var toolbar: Toolbar? = null
    private lateinit var navView: NavigationView

    private lateinit var appBarConfiguration: AppBarConfiguration
  //  private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     //   binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)

        navView = nav_view
        mDrawer = drawer_layout



        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    // handle click
                    replaceFragment(HomeFragment())
                    mDrawer.closeDrawer(Gravity.LEFT)
                    true }
                R.id.nav_apply -> {
                    // handle click

                    replaceFragment(InstalledLuancherFragment())
                    mDrawer.closeDrawer(Gravity.LEFT)
                    true }
                R.id.nav_icons -> {
                    replaceFragment(IconsFragment())
                    mDrawer.closeDrawer(Gravity.LEFT)
                    // handle click
                    true }
                R.id.nav_terms -> {
                    replaceFragment(TermsFragment())
                    mDrawer.closeDrawer(Gravity.LEFT)
                    // handle click
                    true }
                R.id.nav_privacy_policy -> {
                    replaceFragment(PrivacyFragment())
                    mDrawer.closeDrawer(Gravity.LEFT)

                    // handle click
                    true }
                R.id.nav_exit -> {
//                    replaceFragment(ContactUsFragment())
                    finish()
                    // handle click
                    true }

                else -> false
            }


        }

       replaceFragment(HomeFragment())

        /*setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/
    }

    override fun setMainFrameLayoutID() {

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
    //    menuInflater.inflate(R.menu.main_activity2, menu)
        return true
    }

    private fun replaceFragment(fragment: Fragment)
    {
        val transaction = supportFragmentManager?.beginTransaction()
        transaction!!.replace(R.id.container_layout, fragment)
        transaction.addToBackStack("HomeFragment")
        transaction.commit()
    }

    fun getTitlebar(): Titlebar {
        return main_title_bar
    }


    fun openDrawer()
    {
        mDrawer.openDrawer(Gravity.LEFT)
    }

    fun closeDrawer()
    {
        mDrawer.closeDrawer(Gravity.LEFT)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.container_layout)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        checkFragmentStack()
    }

    private fun checkFragmentStack()
    {
        val fm = supportFragmentManager
        val count = fm.backStackEntryCount

        if (count == 0)
        {
            finish()
        }

    }
}