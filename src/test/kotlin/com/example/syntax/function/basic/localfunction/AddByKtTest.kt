package com.example.syntax.function.basic.localfunction

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AddByKtTest {

    @Test
    fun currying1() {
        val addTen = addBy(10);
        val thirty = addTen(20)

        val eleven = addTen(1);
        Assertions.assertThat(thirty).isEqualTo(30)
        Assertions.assertThat(eleven).isEqualTo(11)
    }
}