package c.epi.testing

import org.junit.Assert.*
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivity2Test {

    //declare global
    @get: Rule
    val activityScenario : ActivityScenarioRule<MainActivity2> = ActivityScenarioRule(MainActivity2::class.java)

@Test
fun test_isActivityInView(){
    onView(withId(R.id.secondary))
        .check(matches(isDisplayed()))
}


    @Test
    fun test_visiblity_title_backButton(){

        onView(withId(R.id.activity_secondary_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.button_back))
            .check(matches(isDisplayed()))

    }

    @Test
    fun test_isTitleTextDipslayed(){

        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondaryactivity)))

    }

}