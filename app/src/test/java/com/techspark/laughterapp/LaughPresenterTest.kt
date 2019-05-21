package com.techspark.laughterapp

import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class LaughPresenterTest {

    @Mock
    lateinit var view: Contract.View
   lateinit var laughPresenter: LaughPresenter

    @Before
    fun setUp(){
        MockitoAnnotations.initMocks(this)
        laughPresenter = LaughPresenter(view)
    }

    /**
     * Assert if current index of the class would changed after play function is called
     */
    @Test
    fun load() {

        laughPresenter.play(1)

        verify(view).play(1)
    }

    @Test
    fun play() {
    }
}