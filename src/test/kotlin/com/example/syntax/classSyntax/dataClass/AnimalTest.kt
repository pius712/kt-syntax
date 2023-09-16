package com.example.syntax.classSyntax.dataClass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AnimalTest {

    @Test
    fun toStringTest() {

        val animal = Animal("kim", 10, "lee")
        println(animal)
    }

    @Test
    fun componentNTest() {
        val animal = Animal("kim", 10, "lee")
        println("name ${animal.component1()}")
        println("age ${animal.component2()}")
        println("owner ${animal.component3()}")
    }

    @Test
    fun componentNTest2() {
        val (name, age, owner) = Animal("kim", 10, "lee")
        println("name $name")
        println("age $age")
        println("owner $owner")
    }
}