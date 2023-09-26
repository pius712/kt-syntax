package com.example.syntax.classSyntax.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BasicPersonV2Test {

    @Test
    fun greet() {
        val person = BasicPersonV2("kim", 10, "seoul")

        person.address = "busan";
        Assertions.assertThat(person.greet()).isEqualTo("My name is kim")
    }

    @Test
    fun secondaryConstructor() {

        val person = BasicPersonV2("lee");

        Assertions.assertThat(person.age).isEqualTo(13)
    }

}