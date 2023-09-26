package com.example.syntax.function.basic

open class DefaultParam {

    open fun foo(i:Int = 10):Int {
        return i;
    }
}

class Derived: DefaultParam() {

    // i 는 기본으로 10이 들어간다.
    override fun foo(i: Int): Int {
        return i;
    }

    fun named( bar : Int=10, baz:Int ):Int {
        return bar + baz;
    }
}