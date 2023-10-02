package com.example.syntax.generic.upperbound

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BoxTest {

    @Test
    fun boxTest() {

        val doubleBox = Box<Double>()
        doubleBox.save(1.1);
        Assertions.assertThat(doubleBox.get(0)).isEqualTo(1.1);


        val intBox = Box<Int>();
        intBox.save(10);
        Assertions.assertThat(intBox.get(0)).isEqualTo(10);
    }
}