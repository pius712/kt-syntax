package com.example.syntax.classSyntax.delegation

import kotlin.properties.Delegates

class Delegation(
//        var a: String by lazy {
//
//        }

) {
    val greet: String by lazy {
        Thread.sleep(500);
        println("this is lazy block")
        "hi"
    }


    var hello: String by Delegates.observable("initial") { property, oldValue, newValue ->
        // var com.example.syntax.classSyntax.delegation.Delegation.hello: kotlin.String
        println("property ${property}")
        println("oldValue ${oldValue}")
        println("newValue ${newValue}")
    }
}