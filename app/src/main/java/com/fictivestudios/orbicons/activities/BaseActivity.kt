package com.fictivestudios.orbicons.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fictivestudios.imdfitness.activities.fragments.BaseFragment
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


abstract class BaseActivity : AppCompatActivity() {

    var baseFragment: BaseFragment? = null
    var mainFrameLayoutID: Int = 0
  //  var preferenceHelper: BasePreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //   setContentView(R.layout.activity_base)

       // preferenceHelper = BasePreferenceHelper(this)

        // all cions

        GlobalScope.launch { Dispatchers.Default.apply {

            addDataToList()
        }

        }


    }

    private fun addDataToList() {

        allIconsList.clear()
        allIconsList.add(R.drawable.abstract1)
        allIconsList.add(R.drawable.abstract2)
        allIconsList.add(R.drawable.abstract2_1_)
        allIconsList.add(R.drawable.abstract3)
        allIconsList.add(R.drawable.abstract3_1_)
        allIconsList.add(R.drawable.abstract5)
        allIconsList.add(R.drawable.abstract7_1_)
        allIconsList.add(R.drawable.abstract8)
        allIconsList.add(R.drawable.abstract8_01)
        allIconsList.add(R.drawable.abstract9)
        allIconsList.add(R.drawable.abstract10)
        allIconsList.add(R.drawable.abstract12)
        allIconsList.add(R.drawable.abstract14)
        allIconsList.add(R.drawable.abstract15)
        allIconsList.add(R.drawable.abstract16)
        allIconsList.add(R.drawable.abstract_)
        allIconsList.add(R.drawable.acrobat)
        allIconsList.add(R.drawable.abstract3)
        allIconsList.add(R.drawable.adobe_scan2)
        allIconsList.add(R.drawable.amazon)
        allIconsList.add(R.drawable.abstract7_1_)
        allIconsList.add(R.drawable.amazon_appstore)
        allIconsList.add(R.drawable.amazon_music)
        allIconsList.add(R.drawable.android_central)
        allIconsList.add(R.drawable.arts___letters_daily)
        allIconsList.add(R.drawable.arts___letters_daily_01)
        allIconsList.add(R.drawable.asus_file_explorer)
        allIconsList.add(R.drawable.asus_file_explorer_01)
        allIconsList.add(R.drawable.audiofx)
        allIconsList.add(R.drawable.audiofx___copy)
        allIconsList.add(R.drawable.authenticator___copy)
        allIconsList.add(R.drawable.avast)
        allIconsList.add(R.drawable.avg2)
        allIconsList.add(R.drawable.barcode_scanner)
        allIconsList.add(R.drawable.battery)
        allIconsList.add(R.drawable.bbc_news)
        allIconsList.add(R.drawable.bubble_upnp)
        allIconsList.add(R.drawable.calculator)
        allIconsList.add(R.drawable.calendar)
        allIconsList.add(R.drawable.calender2)
        allIconsList.add(R.drawable.camera1)
        allIconsList.add(R.drawable.camera2)
        allIconsList.add(R.drawable.camera4)
        allIconsList.add(R.drawable.camscanner)
        allIconsList.add(R.drawable.cartoonphotos)
        allIconsList.add(R.drawable.ccleaner)
        allIconsList.add(R.drawable.cellar_tracker2)
        allIconsList.add(R.drawable.chargehub)
        allIconsList.add(R.drawable.chrome)
        allIconsList.add(R.drawable.coinbase)
        allIconsList.add(R.drawable.chromedev_)
        allIconsList.add(R.drawable.currency_converter)
        allIconsList.add(R.drawable.celsius_to_farenheit)
        allIconsList.add(R.drawable.delta)
        allIconsList.add(R.drawable.dictionary3)
        allIconsList.add(R.drawable.dictionary_off_line)
        allIconsList.add(R.drawable.directory2)
        allIconsList.add(R.drawable.dji)
        allIconsList.add(R.drawable.dna5)
        allIconsList.add(R.drawable.dna___copy)
        allIconsList.add(R.drawable.dns2)
        allIconsList.add(R.drawable.docs)
        allIconsList.add(R.drawable.doctogo)
        allIconsList.add(R.drawable.docusign)
        allIconsList.add(R.drawable.duckduckgo)
        allIconsList.add(R.drawable.duo)
        allIconsList.add(R.drawable.ebay)
        allIconsList.add(R.drawable.edge)
        allIconsList.add(R.drawable.email)
        allIconsList.add(R.drawable.excel)
        allIconsList.add(R.drawable.fax)
        allIconsList.add(R.drawable.file2)
        allIconsList.add(R.drawable.file3)
        allIconsList.add(R.drawable.file5)
        allIconsList.add(R.drawable.file_converter2)
        allIconsList.add(R.drawable.file_explorer_)
        allIconsList.add(R.drawable.file_manager_4)
        allIconsList.add(R.drawable.fios_tv)
        allIconsList.add(R.drawable.folder1)
        allIconsList.add(R.drawable.ftp)
        allIconsList.add(R.drawable.fusion)
        allIconsList.add(R.drawable.giphy)
        allIconsList.add(R.drawable.gmailnew)
        allIconsList.add(R.drawable.google)
        allIconsList.add(R.drawable.google_authenticator)
        allIconsList.add(R.drawable.google_calender)
        allIconsList.add(R.drawable.google_chat)
        allIconsList.add(R.drawable.google_drive)
        allIconsList.add(R.drawable.google_earth)
        allIconsList.add(R.drawable.google_files2)
        allIconsList.add(R.drawable.google_home)
        allIconsList.add(R.drawable.google_lense)
        allIconsList.add(R.drawable.google_mail2)
        allIconsList.add(R.drawable.google_map)
        allIconsList.add(R.drawable.google_meet2)
        allIconsList.add(R.drawable.google_music)
        allIconsList.add(R.drawable.google_news11)
        allIconsList.add(R.drawable.google_pay)
        allIconsList.add(R.drawable.google_photos2_01)
        allIconsList.add(R.drawable.google_street_view)
        allIconsList.add(R.drawable.google_translate4)
        allIconsList.add(R.drawable.gpay)
        allIconsList.add(R.drawable.hexagon)
        allIconsList.add(R.drawable.hp_smart)
        allIconsList.add(R.drawable.icon_converter)
        allIconsList.add(R.drawable.instagram2)
        allIconsList.add(R.drawable.ip_scanner)
        allIconsList.add(R.drawable.jrmc1)
        allIconsList.add(R.drawable.jrmc2)
        allIconsList.add(R.drawable.keep)
        allIconsList.add(R.drawable.linkedin)
        allIconsList.add(R.drawable.lumii)
        allIconsList.add(R.drawable.lutron)
        allIconsList.add(R.drawable.marble1)
        allIconsList.add(R.drawable.marble10)
        allIconsList.add(R.drawable.marble11)
        allIconsList.add(R.drawable.marble12)
        allIconsList.add(R.drawable.marble3)
        allIconsList.add(R.drawable.marble4)
        allIconsList.add(R.drawable.marble6)
        allIconsList.add(R.drawable.marble7)
        allIconsList.add(R.drawable.media_monkey)
        allIconsList.add(R.drawable.microsoft_lense2)
        allIconsList.add(R.drawable.mobile_pass)
        allIconsList.add(R.drawable.nest)
        allIconsList.add(R.drawable.nfl)
        allIconsList.add(R.drawable.nova_launcher)
        allIconsList.add(R.drawable.nyt)
        allIconsList.add(R.drawable.off3)
        allIconsList.add(R.drawable.onedrive)
        allIconsList.add(R.drawable.optics)
        allIconsList.add(R.drawable.optics1)
        allIconsList.add(R.drawable.optics2)
        allIconsList.add(R.drawable.optics3)
        allIconsList.add(R.drawable.orb)
        allIconsList.add(R.drawable.orb_logo)
        allIconsList.add(R.drawable.outlook2)
        allIconsList.add(R.drawable.paypal)
        allIconsList.add(R.drawable.pdf3)
        allIconsList.add(R.drawable.pdf_converter)
        allIconsList.add(R.drawable.pinterest)
        allIconsList.add(R.drawable.plugshare)
        allIconsList.add(R.drawable.powerpoint)
        allIconsList.add(R.drawable.print2)
        allIconsList.add(R.drawable.printershare)
        allIconsList.add(R.drawable.ring2)
        allIconsList.add(R.drawable.shortcut)
        allIconsList.add(R.drawable.sonos)
        allIconsList.add(R.drawable.southwest_air)
        allIconsList.add(R.drawable.speed_test)
        allIconsList.add(R.drawable.sun2)
        allIconsList.add(R.drawable.swiftkey2)
        allIconsList.add(R.drawable.target)
        allIconsList.add(R.drawable.tesla)
        allIconsList.add(R.drawable.tumblr_01)
        allIconsList.add(R.drawable.tuneinradio)
        allIconsList.add(R.drawable.twitter2)
        allIconsList.add(R.drawable.uber)
        allIconsList.add(R.drawable.vlc)
        allIconsList.add(R.drawable.voice_search)
        allIconsList.add(R.drawable.wd_mycloud)
        allIconsList.add(R.drawable.weather_frog)
        allIconsList.add(R.drawable.weatherbug)
        allIconsList.add(R.drawable.webtopdf)
        allIconsList.add(R.drawable.whatsapp)
        allIconsList.add(R.drawable.whole_foods)
        allIconsList.add(R.drawable.wifi2)
        allIconsList.add(R.drawable.word4)
        allIconsList.add(R.drawable.workspace)
        allIconsList.add(R.drawable.wsj)
        allIconsList.add(R.drawable.xda)
        allIconsList.add(R.drawable.xodo2)
        allIconsList.add(R.drawable.youtube)
        allIconsList.add(R.drawable.youtube_music)
        allIconsList.add(R.drawable.zedge)
        allIconsList.add(R.drawable.zillow)
        // allIconsList.add(R.drawable.dictionary_off_line)

        // google icons
        googleIconsList.clear()
        googleIconsList.add(R.drawable.gmailnew)
        googleIconsList.add(R.drawable.google)
        googleIconsList.add(R.drawable.google_authenticator)
        googleIconsList.add(R.drawable.google_calender)
        googleIconsList.add(R.drawable.google_chat)
        googleIconsList.add(R.drawable.google_drive)
        googleIconsList.add(R.drawable.google_earth)
        googleIconsList.add(R.drawable.google_files2)
        googleIconsList.add(R.drawable.google_home)
        googleIconsList.add(R.drawable.google_lense)
        googleIconsList.add(R.drawable.google_mail2)
        googleIconsList.add(R.drawable.google_map)
        googleIconsList.add(R.drawable.google_meet2)
        googleIconsList.add(R.drawable.google_music)
        googleIconsList.add(R.drawable.google_news11)
        googleIconsList.add(R.drawable.google_pay)
        googleIconsList.add(R.drawable.google_photos2_01)
        googleIconsList.add(R.drawable.google_street_view)
        googleIconsList.add(R.drawable.google_translate4)
        googleIconsList.add(R.drawable.gpay)
        googleIconsList.add(R.drawable.chrome)
        googleIconsList.add(R.drawable.chrome_)
        googleIconsList.add(R.drawable.chromedev)
        googleIconsList.add(R.drawable.chromedev_)
        googleIconsList.add(R.drawable.docs)
        googleIconsList.add(R.drawable.keep)
        googleIconsList.add(R.drawable.youtube)
        googleIconsList.add(R.drawable.youtube_music)


        //anything goes
        anythingIconsList.clear()
        anythingIconsList.add(R.drawable.abstract1)
        anythingIconsList.add(R.drawable.abstract2)
        anythingIconsList.add(R.drawable.abstract2_1_)
        anythingIconsList.add(R.drawable.abstract3)
        anythingIconsList.add(R.drawable.abstract3_1_)
        anythingIconsList.add(R.drawable.abstract5)
        anythingIconsList.add(R.drawable.abstract7_1_)
        anythingIconsList.add(R.drawable.abstract8)
        anythingIconsList.add(R.drawable.abstract8_01)
        anythingIconsList.add(R.drawable.abstract9)
        anythingIconsList.add(R.drawable.abstract10)
        anythingIconsList.add(R.drawable.abstract12)
        anythingIconsList.add(R.drawable.abstract14)
        anythingIconsList.add(R.drawable.abstract15)
        anythingIconsList.add(R.drawable.abstract16)
        anythingIconsList.add(R.drawable.abstract_)
        anythingIconsList.add(R.drawable.acrobat)
        anythingIconsList.add(R.drawable.abstract3)



        // marble icons
        marbleIconsList.clear()
        marbleIconsList.add(R.drawable.marble1)
        marbleIconsList.add(R.drawable.marble3)
        marbleIconsList.add(R.drawable.marble4)
        marbleIconsList.add(R.drawable.marble6)
        marbleIconsList.add(R.drawable.marble7)
        marbleIconsList.add(R.drawable.marble10)
        marbleIconsList.add(R.drawable.marble11)
        marbleIconsList.add(R.drawable.marble12)

        // system icons
        systemIconsList.clear()
        systemIconsList.add(R.drawable.appdrawer7)
        systemIconsList.add(R.drawable.asus_file_explorer)
        systemIconsList.add(R.drawable.audiofx)
        systemIconsList.add(R.drawable.battery)
        systemIconsList.add(R.drawable.calculator)
        systemIconsList.add(R.drawable.calendar)
        systemIconsList.add(R.drawable.calender2)
        systemIconsList.add(R.drawable.camera1)
        systemIconsList.add(R.drawable.camera2)
        systemIconsList.add(R.drawable.camera4)
        systemIconsList.add(R.drawable.chrome)
        systemIconsList.add(R.drawable.chromedev)
        systemIconsList.add(R.drawable.contacts2)
        systemIconsList.add(R.drawable.directory2)
        systemIconsList.add(R.drawable.duckduckgo)
        systemIconsList.add(R.drawable.edge)
        systemIconsList.add(R.drawable.email)
        systemIconsList.add(R.drawable.file2)
        systemIconsList.add(R.drawable.file3)
        systemIconsList.add(R.drawable.file5)



        //page one icons
        pageOneIconsList.clear()
        pageOneIconsList.add(R.drawable.abstract10)
        pageOneIconsList.add(R.drawable.abstract12)
        pageOneIconsList.add(R.drawable.abstract14)
        pageOneIconsList.add(R.drawable.abstract15)
        pageOneIconsList.add(R.drawable.abstract16)
        pageOneIconsList.add(R.drawable.abstract_)
        pageOneIconsList.add(R.drawable.acrobat)
        pageOneIconsList.add(R.drawable.abstract3)
        pageOneIconsList.add(R.drawable.adobe_scan2)
        pageOneIconsList.add(R.drawable.amazon)
        pageOneIconsList.add(R.drawable.abstract7_1_)
        pageOneIconsList.add(R.drawable.amazon_appstore)



        //pagetwo
        pageTwoIconsList.clear()
        pageTwoIconsList.add(R.drawable.android_central)
        pageTwoIconsList.add(R.drawable.arts___letters_daily)
        pageTwoIconsList.add(R.drawable.arts___letters_daily_01)
        pageTwoIconsList.add(R.drawable.asus_file_explorer)
        pageTwoIconsList.add(R.drawable.asus_file_explorer_01)
        pageTwoIconsList.add(R.drawable.audiofx)
        pageTwoIconsList.add(R.drawable.bubble_upnp)
        pageTwoIconsList.add(R.drawable.authenticator___copy)
        pageTwoIconsList.add(R.drawable.avast)
        pageTwoIconsList.add(R.drawable.avg2)
        pageTwoIconsList.add(R.drawable.barcode_scanner)
        pageTwoIconsList.add(R.drawable.battery)


        // page 3
        pageThreeIconsList.clear()
        pageThreeIconsList.add(R.drawable.bbc_news)
        pageThreeIconsList.add(R.drawable.bubble_upnp)
        pageThreeIconsList.add(R.drawable.calculator)
        pageThreeIconsList.add(R.drawable.calendar)
        pageThreeIconsList.add(R.drawable.calender2)
        pageThreeIconsList.add(R.drawable.camera1)
        pageThreeIconsList.add(R.drawable.camera2)
        pageThreeIconsList.add(R.drawable.camera4)
        pageThreeIconsList.add(R.drawable.camscanner)
        pageThreeIconsList.add(R.drawable.cartoonphotos)
        pageThreeIconsList.add(R.drawable.ccleaner)
        pageThreeIconsList.add(R.drawable.cellar_tracker2)


    }


    abstract fun setMainFrameLayoutID()



    fun replaceFragment(
        frag: BaseFragment,
        tag: String,
        isAddToBackStack: Boolean,
        animate: Boolean
    ) {

        baseFragment = frag
        val transaction = supportFragmentManager.beginTransaction()

        if (animate) {
//            transaction.setCustomAnimations(R.anim.slide_left_in, R.anim.slide_left_out)
            transaction.setCustomAnimations(
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        }
        transaction.replace(mainFrameLayoutID, frag)

        if (isAddToBackStack) {
            transaction.addToBackStack(null).commit()
        } else {
            transaction.commitAllowingStateLoss()
        }

    }

    fun AddFragment(frag: BaseFragment, tag: String, isAddToBackStack: Boolean, animate: Boolean) {

        baseFragment = frag
        val transaction = supportFragmentManager.beginTransaction()

        if (animate) {
//            transaction.setCustomAnimations(R.anim.slide_left_in, R.anim.slide_left_out)
            transaction.setCustomAnimations(
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        }
        transaction.add(mainFrameLayoutID, frag)

        if (isAddToBackStack) {
            transaction.addToBackStack(null).commit()
        } else {
            transaction.commitAllowingStateLoss()
        }
    }
}
