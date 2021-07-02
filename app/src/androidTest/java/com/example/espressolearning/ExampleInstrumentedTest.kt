package com.example.espressolearning

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Test
    fun doLogin() {
        onView(withText("Aplicativo de Testes")).check(matches(isDisplayed()))
        onView(withId(R.id.etd_email)).perform(typeText("anthoni.ipiranga@gmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.etd_password)).perform(typeText("123456"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_login)).perform(click())
        onView(withText("Logado")).check(matches(isDisplayed()))


    }
}