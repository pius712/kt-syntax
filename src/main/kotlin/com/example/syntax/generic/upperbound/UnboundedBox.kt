package com.example.syntax.generic.upperbound

class UnboundedBox<T> {

    private val _storage = mutableListOf<T>();

    fun save(item: T) {
        _storage.add(item)
    }

    fun get(index: Int): T {
        return _storage.get(index)
    }
}
