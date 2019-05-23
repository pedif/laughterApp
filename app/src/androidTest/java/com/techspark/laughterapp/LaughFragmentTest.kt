package com.techspark.laughterapp

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.EspressoKey
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4Builder
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LaughFragmentTest{

    val ids = listOf<Int>(R.id.button_1,
        R.id.button_2,
        R.id.button_3,
        R.id.button_4,
        R.id.button_5,
        R.id.button_6,
        R.id.button_7,
        R.id.button_8,
        R.id.button_9,
        R.id.button_10)
    @Test
    fun testIfButtonsAreDisplayed(){
        val scenario = launchFragmentInContainer<LaughFragment>()

       ids.forEach {
           Espresso.onView(ViewMatchers.withId(it)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
       }

    }

    @Test
    fun testPlayFunction(){
        val scenario = launchFragmentInContainer<LaughFragment>()
        val fragment = LaughFragment()
        fragment.play(R.raw.test1)
        assertNotEquals(fragment.sound,null)
//        assert(fragment.player.isPlaying)

    }

    @Test
    fun testButton1Click(){
        val scenario = launchFragmentInContainer<LaughFragment>()
        val fragment = LaughFragment()
        Espresso.onView(ViewMatchers.withId(R.id.button_1)).perform(ViewActions.click())
        assertEquals(fragment.sound, R.raw.test1)
//        assert(fragment.player.isPlaying)

    }

}