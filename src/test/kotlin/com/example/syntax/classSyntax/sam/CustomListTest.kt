package com.example.syntax.classSyntax.sam

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CustomListTest {

    @Test
    fun tt() {
        val cl = CustomList(listOf("1", "2","3","4"))
        val actual = cl.filter( Predicate<String> {
            it == "2"
        })

        println(actual)
        Assertions.assertThat(actual).isEqualTo(listOf("2"))
    }
}