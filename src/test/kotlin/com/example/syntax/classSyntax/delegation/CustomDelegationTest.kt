package com.example.syntax.classSyntax.delegation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CustomDelegationTest {

    @Test
    fun test1() {
        val delegation = CustomDelegation()

        val first = delegation.greet2
        val second = delegation.greet2

        Assertions.assertThat(first).isEqualTo("hello")
        Assertions.assertThat(second).isEqualTo("hi")
    }
}