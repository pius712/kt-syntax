package com.example.syntax.collection

import org.junit.jupiter.api.Test

class StringRepresentationTest {

    @Test
    fun joinToStringTest() {
        val list = listOf("one", "two", "three", "four")

        val joinToString = list.joinToString("-")
        println(joinToString)
    }

    @Test
    fun joinToStringTest2() {
        val list = listOf("one", "two", "three", "four")

        val joinToString = list.joinToString { "/$it/" }
        println(joinToString)
    }

}