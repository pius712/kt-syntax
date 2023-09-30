package com.example.syntax.collection

import org.junit.jupiter.api.Test

class MutableCollectionTypeTest {


    @Test
    fun mutableTest() {
        val result = MutableCollectionType().foo(mutableListOf("a", "b", "C", "da"))

        println(result)
    }
}