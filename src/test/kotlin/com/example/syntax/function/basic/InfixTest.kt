package com.example.syntax.function.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class InfixTest {

    @Test
    fun infixTest() {

        val infix = Infix()
        Assertions.assertThat( infix.foo()).isEqualTo(3)
    }
}