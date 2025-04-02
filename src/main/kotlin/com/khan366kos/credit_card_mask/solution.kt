package com.khan366kos.credit_card_mask

fun maskify(cc: String): String = cc.takeLast(4).padStart(cc.length, '#')

fun main() {
    println(maskify("Nananananananananananananananana Batman!"))
}