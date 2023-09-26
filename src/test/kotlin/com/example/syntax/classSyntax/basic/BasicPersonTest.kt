package com.example.syntax.classSyntax.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BasicPersonTest {


    @Test
    fun greet() {
        val person = BasicPerson("kim", 10)

        Assertions.assertThat(person.greet()).isEqualTo("My name is kim")
    }





}