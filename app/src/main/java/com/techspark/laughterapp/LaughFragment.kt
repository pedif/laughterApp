package com.techspark.laughterapp


import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class LaughFragment : Fragment(),Contract.View {

    lateinit var  player: MediaPlayer
    var sound: Int? = null

    override fun play(id: Int) {
        sound= id
//        player = MediaPlayer.create(activity,id)
//        player.start()
    }

    lateinit var presenter: Contract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        presenter = LaughPresenter(this)

        val rootView: View = inflater.inflate(R.layout.fragment_laugh, container, false)

        return rootView
    }



}
