package com.example.syntax.controlflow

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ForLoopTest {

    @Test
    fun loopTest() {
        val forLoop = ForLoop()
        val result = forLoop.loop();

        Assertions.assertThat(result).isEqualTo(15)
    }

    @Test
    fun loopRangeTest() {

        val forLoop = ForLoop()

        val actual = forLoop.loopRange()

        Assertions.assertThat(actual).isEqualTo(15)
    }
}