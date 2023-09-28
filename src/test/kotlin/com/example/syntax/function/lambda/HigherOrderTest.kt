package com.example.syntax.function.lambda

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class HigherOrderTest {

    @Test
    fun reduce() {

        val items = listOf(1, 2, 3, 4, 5)
        val actual = items.fold(0, { acc, cur ->
            acc + cur
        })

        Assertions.assertThat(actual).isEqualTo(15)
    }

    @Test
    fun filter() {
        val items = listOf(1, 2, 3, 4, 5)
        val actual = items.map {
            if (it === 2) {
                return@map it - 1
            } else {
                return@map it + 1
            }
        }
        println(actual)
    }


    @Test
    fun implicit() {
        val a = listOf(1, 2, 3, 4, 5).filter {
            val temp = 1 + 2
            if (it == temp) {
                true;
            } else {
                false
            }
        }
        Assertions.assertThat(a.first()).isEqualTo(3)
    }


}