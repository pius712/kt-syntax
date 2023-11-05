package com.example.syntax.generic.reified

// type parameter 를 코드 내에서 사용할 수 있다.
inline fun <reified T> isA(item: Any): Boolean {
    return item is T
}