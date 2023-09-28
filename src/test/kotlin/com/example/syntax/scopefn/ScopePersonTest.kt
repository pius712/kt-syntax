package com.example.syntax.scopefn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@Suppress("KotlinConstantConditions")
class ScopePersonTest {

    @Test
    fun scopeFn() {

        val name = ScopePerson("kim", 10).let {
            it.oneOne()
        }
        assertThat(name).isEqualTo(11)

        val name2 = ScopePerson("lee", 20).run {
            oneOne();
        }

        assertThat(name2).isEqualTo(21)
    }

    @Test
    fun scopeFn2() {
        val a = ScopePerson("lee", 20).also {
            println("hi")
        }
        assertThat(a.age).isEqualTo(20)


        val b = with(ScopePerson("lee", 20)) {
            oneOne()
        }
        assertThat(b).isEqualTo(21);
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
        assertThat(a.size).isEqualTo(3)
    }

    @Test
    fun scopeFn4() {
        val size = mutableListOf<Int>(3).run {
            plus(4)
        }.let {
            println("index 1 item is ${it[1]}")
            it.size
        }

        assertThat(size).isEqualTo(2)
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

    @Test
    @DisplayName("nullable 일 때")
    fun scopeFn6()  {
        var str = listOf<String?>(null, "hello")[0]
        fun processNonNullString(str: String) = println(str)
        val length = str?.let {
            println("let() called on $it")
            processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
            it.length
        }

        assertThat(length).isEqualTo(5)

    }
    @Test
    fun scopeFn7() {
        var str = listOf<String?>(null, "hello")[0]
        fun processNonNullString(str: String) = println(str)
        var legnth2 = str?.let {
            println("let() called on $it")
            processNonNullString(it)
            it.length
        }

        assertThat(legnth2).isNull()
    }

    @Test
    fun scopeFn8()  {
        val maxNum = run {
            val list = listOf(4,5,1,2,3,6);
            list.max()
        }

        assertThat(maxNum).isEqualTo(6)
    }
}