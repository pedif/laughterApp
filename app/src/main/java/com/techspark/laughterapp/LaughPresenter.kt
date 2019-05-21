package com.techspark.laughterapp

class LaughPresenter(private val view: Contract.View) : Contract.Presenter{


    val sounds = listOf<Int>(R.raw.test1)
    override fun play(index: Int) {

        view.play(sounds[index])
    }
}