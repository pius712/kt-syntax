package com.example.syntax.function.basic.localfunction

fun minusBy(num: Int): (b: Int) -> Int {
    return { i: Int -> i - num }
}