package com.example.syntax.generic.upperbound

class Box<T : Number> {

    private val _storage = mutableListOf<T>()
    fun save(item: T) {
        _storage.add(item);
    }

    fun get(index: Int): T {
        return _storage.get(index);
    }
}