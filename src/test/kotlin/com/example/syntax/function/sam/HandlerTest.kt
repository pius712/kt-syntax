package com.example.syntax.function.sam

import org.junit.jupiter.api.Test

class HandlerTest {

    @Test
    fun handler() {

        val handler = Handler()
        // 함수형 인터페이스는 람다 못씀 ㅇㅇ;
//        handler {
//            println("hello")
//        }

        handler.handle2 {
            println("hello")
        }
    }
}