package com.example.syntax.generic.reified

import com.example.syntax.generic.upperbound.UnboundedBox

inline fun <reified T> UnboundedBox<Any?>.assertBy(index: Int): T {
    if (this.get(index) is T) {
        return this.get(index) as T
    } else {
        throw RuntimeException()
    }
}