package com.example.syntax.classSyntax.regularClass
open class Base(open val name: String, val lastName: String,) {

    init { println("Initializing a base class $name ") }

    open val size: Int =
            name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
        name: String,

) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }, "last") {

    init { println("Initializing a derived class") }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}