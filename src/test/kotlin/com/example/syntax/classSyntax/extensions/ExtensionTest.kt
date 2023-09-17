package com.example.syntax.classSyntax.extensions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExtensionTest {

    @Test
    fun test() {
        val ex: List<Extension?> = listOf(null)
        println(ex[0].age)
    }
}