package com.khan366kos.credit_card_mask

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success() {
        assertEquals(
            "####################################man!",
            maskify("Nananananananananananananananana Batman!")
        )
    }
}