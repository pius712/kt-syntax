package com.example.syntax.collection

import org.junit.jupiter.api.Test

class RangesTest {

    @Test
    fun test1() {
        val ranges = Ranges();
        println(ranges.rangeTo(1, 3).toList())
    }

    @Test
    fun test2() {
        println((1..5).toList())
    }

    @Test
    fun test3() {
        println((1..5 step 2).toList())
    }

}