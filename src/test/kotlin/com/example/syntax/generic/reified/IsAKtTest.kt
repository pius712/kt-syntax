package com.example.syntax.generic.reified

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class IsAKtTest {

    @Test
    fun isATest() {
        val isAString1 = isA<String>("123")
        val isAString2 = isA<String>(123)

        Assertions.assertThat(isAString1).isTrue()
        Assertions.assertThat(isAString2).isFalse()
    }
}