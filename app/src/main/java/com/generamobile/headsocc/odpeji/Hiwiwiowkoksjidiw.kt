package com.generamobile.headsocc.eiiwds

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class Yusioskodkosdko(
    @SerializedName("countryCode")
    val zxijczcjixi: String,
)

interface Bhsijidjidjisd {
    @GET("fl_evos.json")
    suspend fun xzcpzxclpczx(): Response<Ewowkkosdiasdji>
}
@Keep
data class Ewowkkosdiasdji(
    @SerializedName("fl_ev_geieu")
    val ijzxcjic: String,
    @SerializedName("fl_ev_vyteow")
    val sppdlpsdlosdkosd: String,
    @SerializedName("fl_ev_apywuisijd")
    val ututjisjisdfjidsfji: String,
)

interface Eqoqkookqokoksdjiij {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun jnvncxsdhuv(): Response<Yusioskodkosdko>
}

class Twiojokskodkos(private val ucxzjicji: Bhsijidjidjisd) {
    suspend fun splsdplsdlpsd() = ucxzjicji.xzcpzxclpczx()
}

class Tiwjiwiskosdko(private val xizjcjizx: Eqoqkookqokoksdjiij) {
    suspend fun sytdsd() = xizjcjizx.jnvncxsdhuv()
}










