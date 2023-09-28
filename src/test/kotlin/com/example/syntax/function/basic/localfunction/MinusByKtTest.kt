package com.example.syntax.function.basic.localfunction

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MinusByKtTest {
    @Test
    fun currying2() {

        val minusTen = minusBy(10);

        val one = minusTen(11);
        val eleven = minusTen(21);

        Assertions.assertThat(one).isEqualTo(1);
        Assertions.assertThat(eleven).isEqualTo(11);
    }
}