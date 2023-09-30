package com.example.syntax.collection

class MutableCollectionType {

    fun foo(mutableList: MutableList<String>): MutableList<String> {
        return mutableList.filterTo(mutableListOf()) { it.contains("a") }

    }
}