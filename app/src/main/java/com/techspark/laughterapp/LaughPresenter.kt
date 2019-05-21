package com.techspark.laughterapp

class LaughPresenter(private val view: Contract.View) : Contract.Presenter{

    var currentIndex: Int = 0

    private val sounds = listOf<Int>(R.raw.test1)


    override fun play(index: Int) {

    }
}