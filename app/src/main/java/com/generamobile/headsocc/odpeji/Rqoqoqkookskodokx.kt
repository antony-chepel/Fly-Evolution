package com.generamobile.headsocc.odpeji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.generamobile.headsocc.R
import com.generamobile.headsocc.databinding.ActivityRqoqoqkookskodokxBinding

class Rqoqoqkookskodokx : AppCompatActivity() {
    private lateinit var oskakodwkowdko : ActivityRqoqoqkookskodokxBinding
    var uzxchuxczhusjiascji: Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oskakodwkowdko = ActivityRqoqoqkookskodokxBinding.inflate(layoutInflater)
        setContentView(oskakodwkowdko.root)
        uzxchuxczhusjiascji = AnimationUtils.loadAnimation(applicationContext, R.anim.ywuisdokwsd)
        fokrplpspfldsp()
    }



    private fun fokrplpspfldsp() = with(oskakodwkowdko){
        roprllpdlpfsdlpfp.startAnimation(uzxchuxczhusjiascji)
        Handler().postDelayed({
            jzxcnjnzxc.startAnimation(uzxchuxczhusjiascji)
        },1000)

        Handler().postDelayed({
            osowkkowdko.startAnimation(uzxchuxczhusjiascji)
        },2000)

        uzxchuxczhusjiascji?.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                roprllpdlpfsdlpfp.visibility = View.GONE
                jzxcnjnzxc.visibility = View.GONE
                osowkkowdko.visibility = View.GONE
                startActivity(
                    Intent(this@Rqoqoqkookskodokx, Kowpwpwposkdjw::class.java)

                )


            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
    }
}