package com.example.syntax.classSyntax.nested

class DefaultNested(
        private val greet: String
) {
    companion object {
        private val companionGreet = "companionHello"
    }

    class Foo {
        fun hello(): String {

            return "hello"
        }

        fun companionHello(): String {
            return companionGreet
        }
    }
}