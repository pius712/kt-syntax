package com.example.syntax.function.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DerivedTest {

    @Test
    fun derived() {

        val derived = Derived()

        Assertions.assertThat(derived.named(baz= 10)).isEqualTo(20)
    }
}