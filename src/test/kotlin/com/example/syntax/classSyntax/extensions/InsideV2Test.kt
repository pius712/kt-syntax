package com.example.syntax.classSyntax.extensions

import org.junit.jupiter.api.Test

class InsideV2Test {

    @Test
    fun test() {

        val insideV2 = InsideV2(OutsideV2());
        println("testtest")
        insideV2.greet()
    }
}