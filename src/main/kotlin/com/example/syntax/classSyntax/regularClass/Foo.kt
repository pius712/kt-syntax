package com.example.syntax.classSyntax.regularClass

open class Foo(open val name:String) {
    init {
        println("foo init $name")
    }
}

class Bar(override val name:String) : Foo(name) {

    init {
        println("Bar init $name")
    }
}