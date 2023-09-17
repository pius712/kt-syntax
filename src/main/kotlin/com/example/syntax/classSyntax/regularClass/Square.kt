package com.example.syntax.classSyntax.regularClass

open class Rectangle {
    open fun draw() {
        println("rectangle draw")
    }
}

interface Polygon {
    fun draw(str:String) {
        println("polygon draw $str")
    } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
//    override fun draw() {
//        super<Rectangle>.draw() // call to Rectangle.draw()
//        super<Polygon>.draw() // call to Polygon.draw()
//    }
}