package com.example.syntax.collection

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class AssociateTest {
    @Test
    @DisplayName("collection을 기반으로 Pair 를 반환해서 Map을 만든다.")
    fun associateTest() {
        val numbers = listOf(1, 2, 3, 4);
        println(numbers.associate { Pair(it, it + 1) })
    }

    @Test
    fun associateWithTest() {
        val numbers = listOf(1, 2, 3, 4);
        numbers.associateWith { it.plus(1) }
    }

    @Test
    @DisplayName("collection의 item이 key가 된다.")
    fun associateWithTest2() {
        val numbers = listOf("one", "two", "three", "four");
        println(numbers.associateWith { it.length })
    }

    @Test
    @DisplayName("collection의 item이 value가 된다.")
    fun associateByTest() {
        val numbers = listOf("one", "two", "three", "four");
        println(numbers.associateBy { it.length })
    }

    @Test
    @DisplayName("collection을 특정 key 기준으로 묶어준다.")
    fun groupByTest() {
        val numbers = listOf("one", "two", "three", "four");
        println(numbers.groupBy { it.length })
    }

}