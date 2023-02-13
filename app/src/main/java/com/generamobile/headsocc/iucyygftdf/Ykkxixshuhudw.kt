package com.generamobile.headsocc.eiiwds

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.headsocc.iucyygftdf.Uywiwijqjhushuhsdnhx
import com.generamobile.headsocc.rewdsfa.Kisosiwhushudgybxc
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val siajdiwjiwdjidwijs = module {

    single  <Bhsijidjidjisd> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Bhsijidjidjisd::class.java)
    }

    single <Eqoqkookqokoksdjiij> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Eqoqkookqokoksdjiij::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://rapturingborealis.art/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Tiwjiwiskosdko(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Twiojokskodkos(get(named("HostInter")))
    }
    single{
        cxugycxgyvxc()
    }
    single (named("SharedPreferences")) {
        yggy(androidApplication())
    }
}

fun yggy(saodasoksdak: Application): SharedPreferences {
    return saodasoksdak.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun cxugycxgyvxc(): Gson {
    return GsonBuilder().create()
}

val eoekookoakosdokjixjicjizxjic = module {
    viewModel (named("MainModel")){
        Uywiwijqjhushuhsdnhx((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Kisosiwhushudgybxc(get())
    }
}