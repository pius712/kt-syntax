package com.example.syntax.function.basic

class Infix {

    fun foo():Int {
        val bar = 1
        return bar.greet(2)
    }
}

infix fun Int.greet(x: Int): Int {
    println(x)
    return x+  this;
}