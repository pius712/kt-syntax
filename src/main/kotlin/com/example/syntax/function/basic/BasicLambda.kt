package com.example.syntax.function.basic

class BasicLambda {
    fun foo(bar: () -> Int): Int {
        return bar();
    }


    fun bar(bar: (Int)->Int):Int {
        return bar(20);
    }
}