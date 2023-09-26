package com.example.syntax.function.basic

class Spread {

    fun spread(vararg string: String) {
        println(string[0])
        println(string[1])
        println(string[2])
    }
}