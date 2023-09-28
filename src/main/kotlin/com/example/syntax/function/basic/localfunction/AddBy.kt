package com.example.syntax.function.basic.localfunction

fun addBy(a: Int): (Int) -> Int {
    return fun(num: Int): Int {
        return a + num;
    }
}