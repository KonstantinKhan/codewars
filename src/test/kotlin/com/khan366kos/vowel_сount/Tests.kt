package com.khan366kos.vowel_сount

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}