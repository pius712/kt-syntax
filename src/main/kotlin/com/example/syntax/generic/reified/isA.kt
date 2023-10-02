package com.example.syntax.generic.reified

inline fun <reified T> isA(item: Any): Boolean {
    return item is T
}