package com.example.syntax.classSyntax.extensions

class InsideV2 (private val outside:OutsideV2){
    fun OutsideV2.fuck() {
        println(this@InsideV2.good());
    }
    fun greet() {
        outside.fuck()
    }
    fun good() :String{
        return "inside good"
    }
}

class OutsideV2 {


    fun good():String {
        return "outside good"
    }
}