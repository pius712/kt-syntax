package com.example.syntax.function.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DefaultParamTest {

    @Test
    fun defaultParam () {
        val derived = Derived()

        println("this is derived foo ${derived.foo()}")
        Assertions.assertThat(derived.foo()).isEqualTo(10)

    }
}