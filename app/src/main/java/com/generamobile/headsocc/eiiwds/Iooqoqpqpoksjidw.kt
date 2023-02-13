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
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.xzpcozxkozxc
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.zxcbhuucxhczxhuzxc
import com.generamobile.headsocc.iucyygftdf.Uywiwijqjhushuhsdnhx
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Iooqoqpqpoksjidw : Fragment() {
    private lateinit var xkzmcmkxc: Context
    lateinit var siajdjiwjidw: String
    val uuxuhjcuzxchucxz by activityViewModel<Uywiwijqjhushuhsdnhx>(named("MainModel"))
    lateinit var jizxcjizxij: String
    val qpqlpplskodko: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var spsdkowokdw: String







    override fun onAttach(context: Context) {
        super.onAttach(context)
        xkzmcmkxc = context
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uuxuhjcuzxchucxz.xizjzxcji.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                qpqlpplskodko.edit().putString("mainId", main).apply()
            }
        }

        uuxuhjcuzxchucxz.aplaspaskoasok.observe(viewLifecycleOwner) {
            if (it != null) {

                jizxcjizxij = it.ijzxcjic
                spsdkowokdw = it.ututjisjisdfjidsfji
                siajdjiwjidw = it.sppdlpsdlosdkosd

                qpqlpplskodko.edit().putString(xzpcozxkozxc, jizxcjizxij).apply()
                qpqlpplskodko.edit().putString(Deioeokoskadijws.xcjjnxjnjnxcvdhu, spsdkowokdw).apply()
                qpqlpplskodko.edit().putString(zxcbhuucxhczxhuzxc, siajdjiwjidw).apply()

                findNavController().navigate(R.id.dookeokoksjida)
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.orkoekkosjiad, container, false)
    }

}