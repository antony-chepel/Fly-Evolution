package com.generamobile.headsocc.rewdsfa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.generamobile.headsocc.databinding.ActivityTwookkosijdjwsBinding
import com.generamobile.headsocc.odpeji.Rqoqoqkookskodokx
import kotlin.random.Random

class Twookkosijdjws : AppCompatActivity() {
    private var icjxvjixcij: CountDownTimer? = null
    val sp_list = listOf(
        50,
        80,
        100,
        200,
        250,
        300,
        350,
        400,
        500
    )

    val prf_lvl = listOf(
        2,
        4,
        5,
        10,
        12,
        15,
        20,
        50,
        100
    )

    val tech_lvl = listOf(
        2,
        6,
        8,
        10,
        12,
        15,
        30,
        80,
        150
    )
    private lateinit var xzijisjajid : ActivityTwookkosijdjwsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xzijisjajid = ActivityTwookkosijdjwsBinding.inflate(layoutInflater)
        setContentView(xzijisjajid.root)



        xzijisjajid.bSet.setOnClickListener {
            okfdgkof()
        }
    }


    private fun okfdgkof() = with(xzijisjajid){
        var pppxockocx = 0
        icjxvjixcij?.cancel()
        icjxvjixcij = object : CountDownTimer(4000,100){
            override fun onTick(millisUntilFinished: Long) {
                pppxockocx++
                bSet.alpha = 0.6f
                bSet.isClickable = false
                if(pppxockocx>8)pppxockocx = 0
                val spdLister = sp_list[pppxockocx]
                val profLister = prf_lvl[pppxockocx]
                val techLister = tech_lvl[pppxockocx]
                tvSpeed.text = "Speed : $spdLister km"
                tvPro.text = "Prof level : x $profLister"
                tvTech.text = "Technical : x $techLister"



            }

            override fun onFinish() {
                bSet.isClickable = true
                val spdLister = sp_list[Random.nextInt(9)]
                val profLister = prf_lvl[Random.nextInt(9)]
                val techLister = tech_lvl[Random.nextInt(9)]
                tvSpeed.text = "Speed : $spdLister km"
                tvPro.text = "Prof level : x $profLister"
                tvTech.text = "Technical : x $techLister"
                bSet.alpha = 1.0f
                Handler().postDelayed({
                    startActivity(
                        Intent(this@Twookkosijdjws, Rqoqoqkookskodokx::class.java)
                    )
                },1000)

            }

        }.start()
    }
}