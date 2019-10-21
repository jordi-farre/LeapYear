package katas

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LeapYearShould {

    private val leapYear: LeapYear = LeapYear()

    @Test
    fun return_true_for_a_leap_year() {
        val isLeapYear = leapYear.isLeapYear(1996)

        assertThat(isLeapYear, `is`(true))
    }

    @ParameterizedTest
    @ValueSource(ints = [2001, 1900])
    fun return_false_for_a_common_year(year: Int) {
        val isLeapYear = leapYear.isLeapYear(year)

        assertThat(isLeapYear, `is`(false))
    }

}