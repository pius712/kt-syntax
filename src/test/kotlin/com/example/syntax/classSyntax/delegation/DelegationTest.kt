package com.example.syntax.classSyntax.delegation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DelegationTest {

    @Test
    fun test1() {
        val del = Delegation()

        Assertions.assertThat(del.greet).isEqualTo("hi")
        Assertions.assertThat(del.greet).isEqualTo("hi")
    }

    @Test
    fun test2() {
        val del = Delegation()

        println(del.hello)
        del.hello = "hello"

    }

    @Test
    fun test3() {
        class Foo {

            fun doSomething(): Unit {
                println("hello")
            }

            fun isValid(): Boolean {
                return true;
            }
        }

        fun example(computeFoo: () -> Foo) {
            val memoizedFoo by lazy(computeFoo)

            if (memoizedFoo.isValid()) {
                memoizedFoo.doSomething()
            }
        }

        example { Foo() }
        example { Foo() }
    }
}