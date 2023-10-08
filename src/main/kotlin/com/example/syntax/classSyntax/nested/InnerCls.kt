package com.example.syntax.classSyntax.nested

class InnerCls(private val greet: String) {

    inner class Foo() {
        fun hello(): String {
            return greet;
        }
    }
}