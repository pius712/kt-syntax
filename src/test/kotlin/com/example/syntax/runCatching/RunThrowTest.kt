package com.example.syntax.runCatching

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RunThrowTest {


    @Test
    fun runTest() {
        val runThrow = RunThrow()
        Assertions.assertThatThrownBy { runThrow.run(true) }.isInstanceOf(RuntimeException::class.java)
    }
}