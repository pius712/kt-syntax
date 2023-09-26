package com.example.syntax.classSyntax.basic

class BasicPerson constructor(
         name:String,
         age:Long,
) {
    // 1 property initialize
    val name = name.also {
        println("what is this?")
    };
    val age = age;

    // 2 initialize block
    init {
        println("this is init block")
    }

    // 3
    init {
        println("this is second init block")
    }
    fun greet():String {
        return "My name is ${name}"
    }
}