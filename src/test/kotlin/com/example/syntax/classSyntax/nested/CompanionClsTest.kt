package com.example.syntax.classSyntax.nested

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CompanionClsTest {

    @Test
    fun companionClsTest() {

        val actual = CompanionCls.Foo.hello();

        Assertions.assertThat(actual).isEqualTo("hello")
    }
}