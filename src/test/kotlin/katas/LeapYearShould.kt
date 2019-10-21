package katas

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Test

class LeapYearShould {

    private val leapYear: LeapYear = LeapYear()

    @Test
    fun return_true_for_a_leap_year() {
        val isLeapYear = leapYear.isLeapYear(2001)

        assertThat(isLeapYear, `is`(true))
    }

}