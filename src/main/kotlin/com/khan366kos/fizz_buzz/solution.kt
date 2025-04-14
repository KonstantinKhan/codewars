package com.khan366kos.fizz_buzz

import java.util.*

fun fizzBuzz(n: Int): Array<String> {
    val result = arrayListOf<String>()
    for (value in 1..n) {
        when {
            value % 15 == 0 -> result.add("FizzBuzz")
            value % 3 == 0 -> result.add("Fizz")
            value % 5 == 0 -> result.add("Buzz")
            else -> result.add(value.toString())
        }
    }
    return result.toTypedArray()
}

fun main() {
    println(fizzBuzz(15).contentToString())
}