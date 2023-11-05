package com.example.syntax.generic.reified

import com.example.syntax.generic.upperbound.UnboundedBox

// 흠,, type parameter 가 유지되는군
inline fun <reified T> UnboundedBox<Any?>.assertBy(index: Int): T {
    if (this.get(index) is T) {
        return this.get(index) as T
    } else {
        throw RuntimeException()
    }
}