package com.generamobile.headsocc.odpeji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsocc.databinding.ActivityKowpwpwposkdjwBinding
import com.generamobile.headsocc.iucyygftdf.Yiwokwijsjidws
import kotlin.random.Random

class Kowpwpwposkdjw : AppCompatActivity() {
    private lateinit var kxzijsjid : ActivityKowpwpwposkdjwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kxzijsjid = ActivityKowpwpwposkdjwBinding.inflate(layoutInflater)
        setContentView(kxzijsjid.root)
        val listscrs = listOf(
            "You won 500 avia gold scores",
            "You won 550 avia gold scores",
            "You won 600 avia gold scores",
            "You won 700 avia gold scores",
            "You won 750 avia gold scores",
            "You won 800 avia gold scores",
            "You won 1000 avia gold scores",
            "You won 200 avia gold scores",
            "You won 2000 avia gold scores",
        )

        kxzijsjid.siajdjijiw.text = listscrs[Random.nextInt(9)]
        kxzijsjid.kzmkxckmzxcjis.setOnClickListener {
            startActivity(Intent(this,Yiwokwijsjidws::class.java))
        }
    }
}