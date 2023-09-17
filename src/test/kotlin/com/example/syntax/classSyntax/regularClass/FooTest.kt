package com.example.syntax.classSyntax.regularClass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FooTest {

    @Test
    fun test() {

        val foo = Bar("kim")
        println(foo.name)
    }
}