package com.example.syntax.classSyntax.enumClass

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ColorTest {
    @Test
    fun enumTest() {
        Assertions.assertThat(Color.BLUE.rgb).isEqualTo(12)
    }
}