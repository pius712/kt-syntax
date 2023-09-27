package com.example.syntax.scopefn

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ScopePersonTest {

    @Test
    fun scopeFn() {

        val name = ScopePerson("kim", 10).let {
            it.oneOne()
        }
        Assertions.assertThat(name).isEqualTo(11)

        val name2 = ScopePerson("lee", 20).run {
            oneOne();
        }

        Assertions.assertThat(name2).isEqualTo(21)
    }

    @Test
    fun scopeFn2() {
        val a = ScopePerson("lee", 20).also {
            println("hi")
        }
        Assertions.assertThat(a.age).isEqualTo(20)


        val b = with(ScopePerson("lee", 20)) {
            oneOne()
        }
        Assertions.assertThat(b).isEqualTo(21);
    }

    @Test
    fun scopeFn3() {
        val a  = mutableListOf<Int>(3)
                .also {
                    println("this is funking kotlin ${it.size}")
                }.apply {
                    add(1)
                    add(2)
                    println("it is function kotlin $size")
                }
        Assertions.assertThat(a.size).isEqualTo(3)
    }

    @Test
    fun scopeFn4() {
        val size = mutableListOf<Int>(3).run {
            plus(4)
        }.let {
            println("index 1 item is ${it[1]}")
            it.size
        }

        Assertions.assertThat(size).isEqualTo(2)
    }

    @Test
    fun scopeFn5() {
        val numbers = mutableListOf("one", "two", "three")
        val countEndsWithE = numbers.run {
            add("four")
            add("five")
            count { it.endsWith("e") }
        }
        println("There are $countEndsWithE elements that end with e.")
    }
}