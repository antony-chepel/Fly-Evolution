package com.generamobile.headsocc.iucyygftdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsocc.databinding.ActivityYiwokwijsjidwsBinding
import com.generamobile.headsocc.rewdsfa.Twookkosijdjws

class Yiwokwijsjidws : AppCompatActivity() {
    private lateinit var suahdaysg : ActivityYiwokwijsjidwsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        suahdaysg = ActivityYiwokwijsjidwsBinding.inflate(layoutInflater)
        setContentView(suahdaysg.root)

       suahdaysg.ososoodosdkosd.setOnClickListener {
           startActivity(Intent(this, Twookkosijdjws::class.java))
       }
        suahdaysg.icjijivjiduhvdhu.setOnClickListener {
           finish()
        }

    }
}