package katas

class LeapYear {

    private infix fun Int.divisibleBy(number: Int) = this % number == 0
    private infix fun Int.notDivisibleBy(number: Int) = this % number != 0

    fun isLeapYear(year: Int): Boolean =
        year divisibleBy 4 &&
            (year notDivisibleBy 100 || year divisibleBy 400)

}
