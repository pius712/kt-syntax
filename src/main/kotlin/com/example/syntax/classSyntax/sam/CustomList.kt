package com.example.syntax.classSyntax.sam

 class CustomList<T>(val item: List<T>) {
     fun filter(predicate: Predicate<T>):List<T> {
         val result = mutableListOf<T>()
         for (each in item) {
             if(predicate.isT(each)) {
                result.add(each)
             }
         }
        return result;
     }
}

fun interface Predicate<T> {
    fun isT(item:T): Boolean
}