package com.example.syntax.function.infix

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NumberBoxTest {

    @Test
    fun test1() {

        val numberBox = NumberBox(3)

        val added = numberBox add 1
        Assertions.assertThat(added.get()).isEqualTo(4)

        val minused = numberBox minus 1
        Assertions.assertThat(minused.get()).isEqualTo(2)
        val multipled = numberBox multiple 3
        Assertions.assertThat(multipled.get()).isEqualTo(9)
        val divided = numberBox divide 2
        Assertions.assertThat(divided.get()).isEqualTo(1)
    }
}