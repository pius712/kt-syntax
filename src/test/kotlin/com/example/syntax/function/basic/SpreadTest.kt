package com.example.syntax.function.basic

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SpreadTest {

    @Test
    fun spreadTest() {
        val spread = Spread()

        spread.spread("1","2","3")

    }

    @Test
    fun spreadTest2() {
        val spread = Spread()

//        spread.spread(listOf("123","456"))
    }
}