package com.example.syntax.collection

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RetrieveTest {

    @Test
    fun last() {
        Assertions.assertThatThrownBy { Retrieve().last(listOf("a", "b", "c", "da")) }
                .isInstanceOf(NoSuchElementException::class.java)
    }

    @Test
    fun lastOrNull() {
        val lastOrNull = listOf("a", "b", "c", "da").lastOrNull { it.contains("z") }

        Assertions.assertThat(lastOrNull).isNull()

    }

    @Test
    fun findLast() {
        val findLast = listOf("a", "b", "c", "da").findLast { it.contains("z") }
        Assertions.assertThat(findLast).isNull()
    }

    @Test
    fun inKeyword() {
        val listOf = listOf("a", "b", "c", "da")

        val hasCharacterA = "a" in listOf
        val b = listOf.filter { "a" in it }
        Assertions.assertThat(hasCharacterA).isTrue()
        Assertions.assertThat(b).isEqualTo(listOf("a", "da"))
    }
}