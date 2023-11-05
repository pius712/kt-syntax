package com.example.syntax.operatorOverloading

class Person(
        var age: Int
) {

    operator fun unaryPlus(): Int {
        age += 1
        return age;
    }

    operator fun unaryMinus(): Person {
        return Person(age - 1)
    }

}