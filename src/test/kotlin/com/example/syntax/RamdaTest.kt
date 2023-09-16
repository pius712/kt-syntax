package com.example.syntax

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RamdaTest {


    @Test
    fun test()  {
        val person1 = Person("kim", 10);

        val r = Ramda().filter(person1) { it.age == 11 }
        println(r);

    }
}