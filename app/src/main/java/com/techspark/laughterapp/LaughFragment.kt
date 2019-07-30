package com.techspark.laughterapp


import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.techspark.laughterapp.databinding.FragmentLaughBinding


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

        presenter = LaughPresenter(this,context!!)

        val binding: FragmentLaughBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_laugh, container, false)

        binding.lifecycleOwner = this
        binding.presenter = presenter

        return binding.root
    }



}
