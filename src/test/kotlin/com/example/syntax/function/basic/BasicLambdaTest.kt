package com.example.syntax.function.basic

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BasicLambdaTest {

    @Test
    fun basicLambda()  {
        val l =  BasicLambda() ;

        Assertions.assertThat(l.foo { 20 }).isEqualTo(20)
    }

    @Test
    fun basicLambda2() {
        val l =  BasicLambda() ;
//        Assertions.assertThat(l.foo { it }).isEqualTo()
    }
}