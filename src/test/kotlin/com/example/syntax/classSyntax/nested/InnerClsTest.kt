package com.example.syntax.classSyntax.nested

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class InnerClsTest {

    @Test
    fun innerClsTest() {

        val actual = InnerCls("hello").Foo().hello()

        Assertions.assertThat(actual).isEqualTo("hello")
    }
}