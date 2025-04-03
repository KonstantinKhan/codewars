package com.khan366kos.returning_strings

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success() {
        assertEquals("Hello, Vasya how are you doing today?", greet("Vasya"))
    }
}