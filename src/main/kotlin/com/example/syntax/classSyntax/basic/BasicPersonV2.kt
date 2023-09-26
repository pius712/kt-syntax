package com.example.syntax.classSyntax.basic

// 생성자에서 선언과 초기화를 동시에 할 수 있음.
// var 선언시 setter 호출 가능.
class BasicPersonV2(
        val name:String,
        val age:Long,
        var address:String
) {

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

    // init block이 먼저 호출되고, secondary constructor가 동작함
    // secondary constructor 에 access 할때 primary conscturctor랑
    // init block이 호출된다고 함.
    constructor(name:String): this(name, 13, "seoul") {
        println("this is second consctructor")
    }
}