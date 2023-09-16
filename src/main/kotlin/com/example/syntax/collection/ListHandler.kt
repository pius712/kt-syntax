package com.example.syntax.collection

import com.example.syntax.Person

class ListHandler {

    fun map1(people: List<Person>): List<Int> {
        return people.map { each ->
            println(each)
            each.age
        }
    }

    fun map2(people: List<Person>): List<Int> {
        return people.map { it.age }
    }

    fun filter(people: List<Person>): List<Person> {
        return people.filter { it.age == 10 }
    }
}