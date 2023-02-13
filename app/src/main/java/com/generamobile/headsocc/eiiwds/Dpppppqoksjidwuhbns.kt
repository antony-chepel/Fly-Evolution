package com.generamobile.headsocc.eiiwds

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.generamobile.headsocc.rewdsfa.Kisosiwhushudgybxc
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.jxczjncxzjnczxjnjzxchusc
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.qkopwowkosjiadsji
import com.generamobile.headsocc.rewdsfa.Deioeokoskadijws.xjizxcijzxcji
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class Dpppppqoksjidwuhbns : AppCompatActivity() {
    private  val xzcjjiczx = 1
    private var suuhsdshudsdhu = false
    private val dokdkoskookxc by viewModel<Kisosiwhushudgybxc>(
        named("BeamModel")
    )

    lateinit var uhxchuhus: WebView

    var lcxlcoxvkxcvkocv = ""
    private var sokdwkowdokwdko: ValueCallback<Array<Uri>>? = null
    private var sshudsdhuusdh: String? = null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uhxchuhus = WebView(this)
        setContentView(uhxchuhus)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(uhxchuhus, true)
        dokdkoskookxc.rokekooksadji(uhxchuhus)

        uhxchuhus.webViewClient = Tisjdijwjijisdi()
        uhxchuhus.webChromeClient = Tiwjiwjiskoadkokoxkcjix()
        uhxchuhus.loadUrl(xzcokskosckokoscji())
    }






    inner class Tiwjiwjiskoadkokoxkcjix : WebChromeClient() {

        override fun onShowFileChooser(
            sdo: WebView?,
            ssdkosdko: ValueCallback<Array<Uri>>?,
            ncncnv: FileChooserParams?
        ): Boolean {
            sokdwkowdokwdko?.onReceiveValue(null)
            sokdwkowdokwdko = ssdkosdko
            var sjidwjidwjidjisokosdk: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (sjidwjidwjidjisokosdk!!.resolveActivity(packageManager) != null) {
                var apalpaskoasko: File? = null
                try {
                    apalpaskoasko = dokokokokxcko()
                    sjidwjidwjidjisokosdk.putExtra("PhotoPath", sshudsdhuusdh)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (apalpaskoasko != null) {
                    sshudsdhuusdh = "file:" + apalpaskoasko.absolutePath
                    sjidwjidwjidjisokosdk.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(apalpaskoasko)
                    )
                } else {
                    sjidwjidwjidjisokosdk = null
                }
            }
            val bibjinjnibjifhug = Intent(Intent.ACTION_GET_CONTENT)
            bibjinjnibjifhug.addCategory(Intent.CATEGORY_OPENABLE)
            bibjinjnibjifhug.type = "image/*"
            val ncxvudidvjidji: Array<Intent?> = sjidwjidwjidjisokosdk?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val oekrjijirrjijidjisf = Intent(Intent.ACTION_CHOOSER)
            oekrjijirrjijidjisf.putExtra(Intent.EXTRA_INTENT, bibjinjnibjifhug)
            oekrjijirrjijidjisf.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            oekrjijirrjijidjisf.putExtra(Intent.EXTRA_INITIAL_INTENTS, ncxvudidvjidji)
            startActivityForResult(oekrjijirrjijidjisf, xzcjjiczx)
            return true
        }

        fun dokokokokxcko(): File? {
            val sokdkosdkowko = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val xzicsuschuschu = "JPEG_" + sokdkosdkowko + "_"
            val aoaskasoasok = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                xzicsuschuschu,
                ".jpg",
                aoaskasoasok
            )
        }
    }


    override fun onBackPressed() {

        if (uhxchuhus.canGoBack()) {
            if (suuhsdshudsdhu) {
                uhxchuhus.stopLoading()
                uhxchuhus.loadUrl(lcxlcoxvkxcvkocv)
            }
            this.suuhsdshudsdhu = true
            uhxchuhus.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                suuhsdshudsdhu = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
    private fun xzcokskosckokoscji(): String {

        val euheuhshuadhu = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val cpxzclpzxkosckosc = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val sijdsjisdjisd = cpxzclpzxkosckosc.getString(xjizxcijzxcji, null)

        val uisddhuhuasdhuasdhu = cpxzclpzxkosckosc.getString(qkopwowkosjiadsji, null)
        val ozxccixjjizxczxjic = cpxzclpzxkosckosc.getString(jxczjncxzjnczxjnjzxchusc, null)


        when (cpxzclpzxkosckosc.getString("WebInt", null)) {
            "campaign" -> {
                dokdkoskookxc.twhushudhu(ozxccixjjizxczxjic.toString())
            }
            "deepLink" -> {
                dokdkoskookxc.twhushudhu(ozxccixjjizxczxjic.toString())
            }
            "deepLinkNOApps" -> {
                dokdkoskookxc.twhushudhu(uisddhuhuasdhuasdhu.toString())
            }
            "geo" -> {
                dokdkoskookxc.twhushudhu(uisddhuhuasdhuasdhu.toString())
            }
        }
        return euheuhshuadhu.getString("SAVED_URL", sijdsjisdjisd).toString()
    }

    override fun onActivityResult(rokeokkosakod: Int, aopaskoaskoas: Int, jiczxjiczxji: Intent?) {

        if (rokeokkosakod != xzcjjiczx || sokdwkowdokwdko == null) {
            super.onActivityResult(rokeokkosakod, aopaskoaskoas, jiczxjiczxji)
            return
        }
        var okrokkosdkof: Array<Uri>? = null

        if (aopaskoaskoas == RESULT_OK) {
            if (jiczxjiczxji == null) {
                if (sshudsdhuusdh != null) {
                    okrokkosdkof = arrayOf(Uri.parse(sshudsdhuusdh))
                }
            } else {
                val saijdsjiasdjiasdjixkozcoxzxcko = jiczxjiczxji.dataString
                if (saijdsjiasdjiasdjixkozcoxzxcko != null) {
                    okrokkosdkof = arrayOf(Uri.parse(saijdsjiasdjiasdjixkozcoxzxcko))
                }
            }
        }
        sokdwkowdokwdko!!.onReceiveValue(okrokkosdkof)
        sokdwkowdokwdko = null
        return
    }


    fun rokekokoakosd(xzcjizxcji: String?) {
        if (!xzcjizxcji!!.contains("t.me")) {

            if (lcxlcoxvkxcvkocv == "") {
                lcxlcoxvkxcvkocv = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    xzcjizxcji
                ).toString()

                val fokrkodskofko = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val wopkkosdko = fokrkodskofko.edit()
                wopkkosdko.putString("SAVED_URL", xzcjizxcji)
                wopkkosdko.apply()
            }
        }
    }

    inner class Tisjdijwjijisdi: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (dokdkoskookxc.iuzchuzuhchuhuschu(url)) {

                    val xijcjisjiscji = Intent(Intent.ACTION_VIEW)
                    xijcjisjiscji.data = Uri.parse(url)
                    startActivity(xijcjisjiscji)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            rokekokoakosd(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Dpppppqoksjidwuhbns, description, Toast.LENGTH_SHORT).show()
        }
    }



}

