package com.khan366kos.disemvowel_trolls

fun disemvowel(str: String): String = Regex("[aeiouAEIOU]").replace(str, "")