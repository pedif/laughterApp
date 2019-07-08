package com.techspark.laughterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this,resources.getString(R.string.ad_id) )

        val adReq =  AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR ).build()

        adView.loadAd(adReq)

    }
}
