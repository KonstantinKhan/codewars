package com.khan366kos.does_my_list_include_this

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success() {
        assertEquals(true, include(intArrayOf(0,1,2,3,5,8,13,2,2,2,11), 0))
    }
}