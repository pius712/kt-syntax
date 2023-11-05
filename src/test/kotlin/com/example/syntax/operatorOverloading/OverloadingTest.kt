package com.example.syntax.operatorOverloading

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class OverloadingTest {

    @Test
    fun test1() {
        val person = Person(1)
        +person
//        val person2 = +person;

        Assertions.assertThat(person.age).isEqualTo(2)
    }


    @Test
    fun test2() {
        val person = Person(1)
        val person2 = -person;

        Assertions.assertThat(person2.age).isEqualTo(-1)
    }


    @Test
    fun test3() {
        val list = mutableListOf(1, 2, 3)
        list += 4
    }
}