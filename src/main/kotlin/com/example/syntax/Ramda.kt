package com.example.syntax

class Ramda {
    fun filter(person: Person, predicate: (person: Person) -> Boolean):Person? {
        return if(predicate(person)) {
            person
        }else {
            null
        }
    }
}


