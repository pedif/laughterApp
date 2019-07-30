package com.techspark.laughterapp

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class LaughPresenter(private val view: Contract.View, private val context: Context) : Contract.Presenter{

    private var firebaseAnalytics: FirebaseAnalytics = FirebaseAnalytics.getInstance(context)

    val sounds = listOf<Int>(
        R.raw.sound_applause,
        R.raw.sound_baby,
        R.raw.sound_demonic,
        R.raw.sound_fast,
        R.raw.sound_lol,
        R.raw.sound_idiotic,
        R.raw.sound_lmao,
        R.raw.sound_silly,
        R.raw.sound_snoring,
        R.raw.sound_witch
    )

    override fun play(index: Int) {

        view.play(sounds[index])

        //Logs an event for every click of buttons with the index of that button
        val bundle = Bundle()
        bundle.putInt(FirebaseAnalytics.Param.ITEM_ID,index)
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,bundle)

    }
}