package com.fictivestudios.orbicons.utils

import android.content.Context
import android.content.pm.PackageManager

var allIconsList = ArrayList<Int>()
var googleIconsList = ArrayList<Int>()
var anythingIconsList = ArrayList<Int>()
var marbleIconsList = ArrayList<Int>()
var systemIconsList = ArrayList<Int>()


var pageOneIconsList = ArrayList<Int>()
var pageTwoIconsList = ArrayList<Int>()
var pageThreeIconsList = ArrayList<Int>()

const val ACTION_APPLY_ICON_THEME = "com.teslacoilsw.launcher.APPLY_ICON_THEME"

const val EXTRA_ICON_THEME_PACKAGE = "com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE"
const val EXTRA_ICON_THEME_TYPE = "com.teslacoilsw.launcher.extra.ICON_THEME_TYPE"
const val APEX_ACTION_SET_THEME = "com.anddoes.launcher.SET_THEME"
const val APEX_EXTRA_PACKAGE_NAME = "com.anddoes.launcher.THEME_PACKAGE_NAME"
const val AVIATE_ACTION_SET_THEME = "com.tul.aviate.SET_THEME"
const val AVIATE_EXTRA_PACKAGE_NAME = "THEME_PACKAGE"

const val NOVA_PACKAGE = "com.teslacoilsw.launcher"
const val NEXT_PACKAGE = "com.gtp.nextlauncher"
const val HOLO_PACKAGE = "com.mobint.hololauncher"
const val GO_PACKAGE = "com.gau.go.launcherex"
const val ADW_PACKAGE = "org.adw.launcher"
const val APEX_PACKAGE = "com.anddoes.launcher"




const val NOVA = "Nova"
const val NEXT = "Next"
const val HOLO = "Holo"
const val GO = "Go"
const val ADW = "ADW"
const val APEX = "Apex"






 fun isPackageInstalled(packageName: String?, context: Context): Boolean {
    val pm = context.packageManager
    return try {
        pm.getPackageInfo(packageName!!, PackageManager.GET_ACTIVITIES)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}