package com.fictivestudios.orbicons.adapters

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.fictivestudios.orbicons.R
import com.fictivestudios.orbicons.models.Launcher
import com.google.android.material.internal.ContextUtils.getActivity
import kotlinx.android.synthetic.main.item_icon.view.*
import kotlinx.android.synthetic.main.item_icon.view.iv_icon
import kotlinx.android.synthetic.main.item_launcher.view.*
import androidx.core.content.ContextCompat.startActivity
import com.fictivestudios.orbicons.utils.*


class LauncherAdapter (context: Context, private val mlist:ArrayList<Launcher>)
    :RecyclerView.Adapter<LauncherAdapter.ViewHolder>(){

    val contex = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_launcher, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.itemView.iv_icon.setImageResource(mlist[position].icon)
        holder.itemView.tv_laucher_name.setText(mlist[position].name)



        holder.itemView.setOnClickListener {
            mlist[position].name

            if (mlist[position].name == NOVA)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(NOVA_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }

            else if (mlist[position].name == NEXT)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(NEXT_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }

            else if (mlist[position].name == GO)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(GO_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }

            else if (mlist[position].name == HOLO)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(HOLO_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }

            else if (mlist[position].name == ADW)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(ADW_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }
            else if (mlist[position].name == APEX)
            {
                val launchIntent: Intent? =
                    contex.getPackageManager().getLaunchIntentForPackage(APEX_PACKAGE)
                if (launchIntent != null) {
                    contex.startActivity(launchIntent) //null pointer check in case package name was not found
                }
                else{
                    Toast.makeText(contex, "launcher not installed", Toast.LENGTH_SHORT).show()
                }
            }
      /*      val nova = Intent(ACTION_APPLY_ICON_THEME)
            nova.setPackage(NOVA_PACKAGE)
            nova.putExtra(EXTRA_ICON_THEME_TYPE, "GO")
            nova.putExtra(
                EXTRA_ICON_THEME_PACKAGE,
                "com.teslacoilsw.launcher"
            )
            contex.startActivity(nova)*/
     /*       try {
                startActivity(nova)
            } catch (e: ActivityNotFoundException) {
                val novaMarket = Intent(Intent.ACTION_VIEW)
                novaMarket.data = Uri
                    .parse(getResources().getString(R.string.launcher_nova_market))
                startActivity(novaMarket)
                val failedNova: Toast = Toast
                    .makeText(
                        getActivity().getBaseContext(),
                        getResources().getString(R.string.nova_market),
                        Toast.LENGTH_SHORT
                    )
                failedNova.show()
            }*/
        }

    }


    override fun getItemCount(): Int { return mlist.size }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {

    }


}