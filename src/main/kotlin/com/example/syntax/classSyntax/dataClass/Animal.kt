package com.example.syntax.classSyntax.dataClass

data class Animal(val name:String, val age:Int, val owner: String) {

    override fun toString(): String {
        return "this is animal"
    }
}
