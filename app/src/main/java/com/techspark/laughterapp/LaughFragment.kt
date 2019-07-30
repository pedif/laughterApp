package com.techspark.laughterapp


import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.crashlytics.android.Crashlytics
import com.techspark.laughterapp.databinding.FragmentLaughBinding


class LaughFragment : Fragment(), Contract.View {

    private var player: MediaPlayer? = null

    override fun play(id: Int) {
        try {
            if (player != null)
                player?.pause()
            player = MediaPlayer.create(activity, id).apply {
                start()
            }
        } catch (e: Exception) {
            Crashlytics.logException(e)
        }
    }

    lateinit var presenter: Contract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        presenter = LaughPresenter(this, context!!)

        val binding: FragmentLaughBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_laugh, container, false
        )

        binding.lifecycleOwner = this
        binding.presenter = presenter

        return binding.root
    }

    override fun onStop() {
        super.onStop()
        if (player != null) {
            player?.release()
            player = null
        }
    }


}
