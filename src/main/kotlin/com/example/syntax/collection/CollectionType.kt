package com.example.syntax.collection

class CollectionType {

    fun foo(collections: Collection<String>): List<String> {
        println("size: $collections.size");

        // 여기서 애초에 타입 에러가 이상하게 난다.
        // plus에서 체크되어야하는거 아님?
        val added = collections.plus(1)

        println(added);
//        return added;
        return listOf()
    }
}
