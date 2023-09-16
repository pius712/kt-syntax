package com.example.syntax.classSyntax.dataClass

open class Foo(val name:String) {

}

class Baz(override val name:String, val age:Int) : Foo(name ) {

}
data class Bar(override var name:String, val age: Int) : Foo(name) {

}


open class FooBar {

    fun go() {

    }
}

class BarFoo: FooBar() {

    fun go() {

    }
}