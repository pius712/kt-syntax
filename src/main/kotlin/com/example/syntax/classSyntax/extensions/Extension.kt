package com.example.syntax.classSyntax.extensions

class Extension(
        val name:String
) {
}


val Extension?.age :Int
    get() = 10