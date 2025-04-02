package com.khan366kos.pare_nice_int_from_char_problem

import com.khan366kos.parse_nice_int_from_char_problem.ParseIntCharProblem
import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun success() {
        assertEquals(4, ParseIntCharProblem().getAge("4 years old"))
    }
}