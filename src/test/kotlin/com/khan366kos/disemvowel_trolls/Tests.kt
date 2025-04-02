package com.khan366kos.disemvowel_trolls

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success(): Unit {
        assertEquals(disemvowel("This website is for losers LOL!"), "Ths wbst s fr lsrs LL!")
    }
}

