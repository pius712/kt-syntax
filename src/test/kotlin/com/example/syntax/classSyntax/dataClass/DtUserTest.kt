package com.example.syntax.classSyntax.dataClass

import org.junit.jupiter.api.Test

class DtUserTest {

    @Test
    fun dtUserTest()  {
        val dtUser = DtUser("kim", 10)
        val copy = dtUser.copy(name = "hi")

        println(copy)
    }
}