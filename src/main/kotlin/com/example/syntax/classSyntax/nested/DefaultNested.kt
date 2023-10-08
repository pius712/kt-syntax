package com.example.syntax.classSyntax.nested

class DefaultNested(
        private val greet: String
) {
    class Foo {
        fun hello(): String {
            return "hello"
        }
    }
}