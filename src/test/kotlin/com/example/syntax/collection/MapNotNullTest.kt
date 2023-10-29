package com.example.syntax.collection

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MapNotNullTest {

    @Test
    fun mapNotNullTest() {
        val mapNotNull = listOf(1, 2, 3).mapNotNull {
            if (it % 2 == 0) {
                return@mapNotNull null
            }
            it
        }

        Assertions.assertThat(mapNotNull).isEqualTo(listOf(1, 3))
    }

    @Test
    fun mapNotNull2Test() {
        val mapNotNull = listOf(1, 2, 3).mapNotNull {
            if (it % 2 == 0) null else it
        }

        Assertions.assertThat(mapNotNull).isEqualTo(listOf(1, 3))
    }

    @Test
    fun mapIndexedTest() {
        val result = listOf(1, 2, 3, 4, 5).mapIndexed { idx, value ->
            idx * value
        }
        println(result)
    }


}