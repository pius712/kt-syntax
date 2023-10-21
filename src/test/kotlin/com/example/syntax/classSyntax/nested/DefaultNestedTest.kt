package com.example.syntax.classSyntax.nested

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DefaultNestedTest {

    @Test
    fun defaultInnerTest() {


        val greeting = DefaultNested.Foo().hello();

        Assertions.assertThat(greeting).isEqualTo({})
    }

    @Test
    fun companionTest() {
        val greeting = DefaultNested.Foo().companionHello();
        Assertions.assertThat(greeting).isEqualTo("companionHello")
    }
}