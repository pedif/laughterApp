package com.techspark.laughterapp

class LaughPresenter(private val view: Contract.View) : Contract.Presenter{


    val sounds = listOf<Int>(
        R.raw.applause,
        R.raw.children,
        R.raw.demonic,
        R.raw.fast,
        R.raw.hard,
        R.raw.idiotic,
        R.raw.lmao,
        R.raw.silly,
        R.raw.snoring,
        R.raw.witches
    )
    override fun play(index: Int) {

        view.play(sounds[index])
    }
}