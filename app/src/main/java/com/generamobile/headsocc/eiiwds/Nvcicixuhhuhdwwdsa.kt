package com.generamobile.headsocc.eiiwds

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsocc.R
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.xcjjnxjnjnxcvdhu
import com.generamobile.headsocc.iucyygftdf.Uywiwijqjhushuhsdnhx
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Nvcicixuhhuhdwwdsa : Fragment() {
    lateinit var siuushushud: String
    private lateinit var xlzcczxokzxkozx: Context
    val sygdwftwdftwdft by activityViewModel<Uywiwijqjhushuhsdnhx>(named("MainModel"))

    val xjcjisjiciscj: SharedPreferences by inject(named("SharedPreferences"))






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.uwiwoskdw, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ycycycycxuvhvxchu = xjcjisjiciscj.getString(xcjjnxjnjnxcvdhu, null)
        val pzplzlpzlpxkojisdji = xjcjisjiciscj.getString("appCamp", null)

        if (ycycycycxuvhvxchu=="1" &&pzplzlpzlpxkojisdji == null) {
            sygdwftwdftwdft.vokcvkojiijjidfji(xlzcczxokzxkozx)
            sygdwftwdftwdft.xkzkzxcmczx.observe(viewLifecycleOwner) {
                if (it != null) {
                    siuushushud = it.toString()
                    xjcjisjiciscj.edit().putString("appCamp", siuushushud).apply()
                    findNavController().navigate(R.id.oxzkckooksaokjicw)
                }
            }
        } else {
            findNavController().navigate(R.id.oxzkckooksaokjicw)
        }
    }




    override fun onAttach(context: Context) {
        super.onAttach(context)
        xlzcczxokzxkozx = context
    }


}