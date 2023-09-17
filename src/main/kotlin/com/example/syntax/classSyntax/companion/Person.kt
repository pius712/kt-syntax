package com.example.syntax.classSyntax.companion

class Person2 private constructor(val name:String){

    private fun hello() {
        println(name)
    }
    companion object {
        fun greet() {
            Person2("").hello()
        }
    }
}

//val p = Person2.greet()