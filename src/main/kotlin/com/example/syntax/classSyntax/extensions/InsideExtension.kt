package com.example.syntax.classSyntax.extensions

class InsideExtension(private val outside:Outside) {

    fun Outside.fuck() {
        println(myName());
        println("fuck")
    }

    fun greet() {
        outside.fuck()
    }
}


class Outside {

    fun myName():String {
        return "outside"
    }
}