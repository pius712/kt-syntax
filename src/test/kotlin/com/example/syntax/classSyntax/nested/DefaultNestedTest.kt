package com.example.syntax.classSyntax.nested

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DefaultNestedTest {

    @Test
    fun defaultInnerTest() {

        val defaultNested = DefaultNested("hello")

        val greeting = DefaultNested.Foo().hello();

        Assertions.assertThat(greeting).isEqualTo({})
    }
}