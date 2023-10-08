package com.example.syntax.classSyntax.nested

class CompanionCls(private val greet: String) {

    private fun outerHello(): String {
        return greet
    }

    companion object Foo {
        fun hello(): String {
            return CompanionCls("hello").outerHello();
        }
    }
}