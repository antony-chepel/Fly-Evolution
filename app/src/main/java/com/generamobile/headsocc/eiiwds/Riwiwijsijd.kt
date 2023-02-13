package com.generamobile.headsocc.eiiwds

import android.app.Application
import android.content.Context
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.rirkoekoekookdkof
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.qkopwowkosjiadsji
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.otoktjifdjif
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.wopwlwlpwlpslpdpsl
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Riwiwijsijd: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(rirkoekoekookdkof)

        val iasjdjiwji = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val iuzxcjzjixcji = getSharedPreferences("PREFS_NAME", 0)

        val syaduhhusdahu = MyTracker.getTrackerParams()
        val opzxckozkockozskojiacsji = MyTracker.getTrackerConfig()
        val suhdahusdahus = MyTracker.getInstanceId(this)
        opzxckozkockozskojiacsji.isTrackingLaunchEnabled = true
        val oxzckzxkocji = UUID.randomUUID().toString()

        if (iuzxcjzjixcji.getBoolean("my_first_time", true)) {
            syaduhhusdahu.setCustomUserId(oxzckzxkocji)
            iasjdjiwji.edit().putString(qkopwowkosjiadsji, oxzckzxkocji).apply()
            iasjdjiwji.edit().putString(wopwlwlpwlpslpdpsl, suhdahusdahus).apply()
            iuzxcjzjixcji.edit().putBoolean("my_first_time", false).apply()
        } else {
            val saijdasjiadsji = iasjdjiwji.getString(qkopwowkosjiadsji, oxzckzxkocji)
            syaduhhusdahu.setCustomUserId(saijdasjiadsji)
        }
        MyTracker.initTracker(otoktjifdjif, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Riwiwijsijd)
            modules(
                listOf(
                    eoekookoakosdokjixjicjizxjic, siajdiwjiwdjidwijs
                )
            )
        }
    }
}