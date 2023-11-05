package com.example.syntax.collection

class Ranges {


    fun rangeTo(start: Int, end: Int): IntRange {
        return start..end
    }

    fun rangeToByStep(start: Int, end: Int, step: Int): IntProgression {
        return (start..end) step 2
    }
}