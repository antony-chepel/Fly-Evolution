package com.generamobile.headsocc.odpeji

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import com.generamobile.headsocc.R
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.suusushdsisdijsd
import com.generamobile.headsocc.iucyygftdf.Uywiwijqjhushuhsdnhx
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Zppqpqpqpowkijsjidw : Fragment() {
    val xzijxizcjzxcji: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var zioxcckozxo: Context
    lateinit var ijsadjisisdjokxcko: String
    val siojdisjisd by activityViewModel<Uywiwijqjhushuhsdnhx>(named("MainModel"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        siojdisjisd.sydsdhusdhu.observe(viewLifecycleOwner) {
            if (it!=null) {
                ijsadjisisdjokxcko = it.zxijczcjixi
                xzijxizcjzxcji.edit().putString(suusushdsisdijsd, ijsadjisisdjokxcko).apply()
                findNavController().navigate(R.id.kxzkcokosakojixijz)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        zioxcckozxo = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tokokrokoksdji, container, false)
    }









}