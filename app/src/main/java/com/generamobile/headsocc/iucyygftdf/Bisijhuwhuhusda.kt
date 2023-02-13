package com.generamobile.headsocc.iucyygftdf

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsocc.R
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Bisijhuwhuhusda : Fragment() {
    private lateinit var xzcijzxc: Context
    val sioasdodask by activityViewModel<Uywiwijqjhushuhsdnhx>(named("MainModel"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sioasdodask.orkkorkoekokodskofsdo(xzcijzxc)

        findNavController().navigate(R.id.ywtwtfisjd)

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        xzcijzxc=context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.aoddkjixhucuhasw, container, false)
    }




}