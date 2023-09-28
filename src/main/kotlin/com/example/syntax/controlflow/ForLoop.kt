package com.example.syntax.controlflow

class ForLoop {

    fun loop(): Int {
        val numbers = (1..5).toList()
        var result: Int = 0
        for (number in numbers) {
            result += number
        }
        return result;

    }


    fun loopRange(): Int {
        var result: Int = 0;
        for (i in 1..5) {
            result += i
        }

        return result
    }
}