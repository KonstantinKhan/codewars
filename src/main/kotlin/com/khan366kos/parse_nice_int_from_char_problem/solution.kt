package com.khan366kos.parse_nice_int_from_char_problem

class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int = Regex("""\D""").replace(yearsOld, "").toInt()
}