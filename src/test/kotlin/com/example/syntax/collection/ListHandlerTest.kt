package com.example.syntax.collection

import com.example.syntax.Person
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*
import java.util.function.Predicate
import kotlin.collections.ArrayList

class ListHandlerTest {

    val people = listOf(Person("kim", 10),
            Person("lee", 20),
            Person("park", 30),
            Person("choi", 40),
            Person("jeong", 10))

    @Test
    fun mapTest() {
//        val listHandler = ListHandler();

//        val actual = listHandler.map1(people);
        val actual = people.filter(fun (each): Boolean = each.age === 20)
        Assertions.assertThat(actual).isEqualTo(listOf(10,20,30,40,10))
    }

    @Test
    fun map2Test() {
        val listHandler = ListHandler();

        val actual = listHandler.map2(people);
        println(actual)
    }

    @Test
    fun countTest() {
        val actual1 = people.count()
        val actual2 = people.count { it.age ==10 }
        println("actual1 ${actual1}")
        println("actual2 $actual2")
    }

    @Test
    fun anyTest() {
        val actual = people.any{it.age ==70}
        println(actual)
    }

    @Test
    fun groupByTest() {
        val actual = people.groupBy { it.age }
        println(actual)
    }

    @Test
    fun mapKeysTest() {
        val actual = people.groupBy { it.age }.mapKeys { each->
            println("each ${each.key} ${each.value}")
            each.toString() }

        println(actual)
    }

    @Test
    fun mapKeys2Test() {
        val actual = people.groupBy { it.age }.mapKeys { it.key + 1 }

        println(actual)
    }
    @Test
    fun filterTest() {
        val listHandler = ListHandler();

        val actual = listHandler.filter(people);
        println(actual)
    }
}
