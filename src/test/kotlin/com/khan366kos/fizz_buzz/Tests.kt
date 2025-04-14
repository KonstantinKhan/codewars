package com.khan366kos.fizz_buzz

import kotlin.test.Test
import kotlin.test.assertTrue

class Tests {
    @Test
    fun success() {
        assertTrue(
            fizzBuzz(15) contentEquals arrayOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            )
        )
    }
}