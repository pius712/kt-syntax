package com.example.syntax.classSyntax.properties

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class LateInitTest {

    @Test
    fun test1() {
        val lateInit = LateInit()

        Assertions.assertThatThrownBy { lateInit.hello() }
                .isInstanceOf(UninitializedPropertyAccessException::class.java)
    }

    
}