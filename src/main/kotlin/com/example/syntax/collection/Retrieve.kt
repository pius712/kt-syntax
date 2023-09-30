package com.example.syntax.collection

class Retrieve {

    fun last(list: List<String>): String {
        return list.last { it.contains("z") }
    }
}