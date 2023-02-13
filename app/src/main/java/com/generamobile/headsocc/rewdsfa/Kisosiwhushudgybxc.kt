package com.generamobile.headsocc.rewdsfa

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Kisosiwhushudgybxc(saidjasji: Application): ViewModel() {
    val ozxkkoczxkozxc = saidjasji.packageManager


    fun iuzchuzuhchuhuschu(stfsd: String): Boolean {
        try {
            ozxkkoczxkozxc.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }



    fun rokekooksadji(xzijjzxci: WebView): WebSettings{
        val plpwplwkoskooasdoasd = xzijjzxci.settings
        plpwplwkoskooasdoasd.domStorageEnabled = true
        plpwplwkoskooasdoasd.userAgentString = plpwplwkoskooasdoasd.userAgentString.replace("; wv", "")
        plpwplwkoskooasdoasd.cacheMode = WebSettings.LOAD_DEFAULT
        plpwplwkoskooasdoasd.allowFileAccess = true
        plpwplwkoskooasdoasd.displayZoomControls = false
        plpwplwkoskooasdoasd.builtInZoomControls = true
        plpwplwkoskooasdoasd.setSupportMultipleWindows(false)
        plpwplwkoskooasdoasd.pluginState = WebSettings.PluginState.ON
        plpwplwkoskooasdoasd.useWideViewPort = true
        plpwplwkoskooasdoasd.loadWithOverviewMode = true
        plpwplwkoskooasdoasd.allowContentAccess = true
        plpwplwkoskooasdoasd.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        plpwplwkoskooasdoasd.setSupportZoom(true)
        plpwplwkoskooasdoasd.javaScriptEnabled = true
        plpwplwkoskooasdoasd.allowContentAccess = true
        plpwplwkoskooasdoasd.allowFileAccess = true
        plpwplwkoskooasdoasd.javaScriptCanOpenWindowsAutomatically = true

        plpwplwkoskooasdoasd.mediaPlaybackRequiresUserGesture = false




        return plpwplwkoskooasdoasd
    }




    fun twhushudhu(xcijzxcji: String) {
        OneSignal.setExternalUserId(
            xcijzxcji,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(rokoksdfko: JSONObject) {
                    try {
                        if (rokoksdfko.has("push") && rokoksdfko.getJSONObject("push").has("success")) {
                            val xzijzxcij = rokoksdfko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $xzijzxcij"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (rokoksdfko.has("email") && rokoksdfko.getJSONObject("email").has("success")) {
                            val wpkspkdksodksd =
                                rokoksdfko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $wpkspkdksodksd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (rokoksdfko.has("sms") && rokoksdfko.getJSONObject("sms").has("success")) {
                            val kcxznzxcjnzxc = rokoksdfko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $kcxznzxcjnzxc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }





}