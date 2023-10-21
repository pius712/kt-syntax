package com.example.syntax.classSyntax.nested

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NamedCompanionTest {

    @Test
    fun namedCompanionTest() {
        println(NamedCompanion.Foo::class);
        println(NamedCompanion.Foo);
        println(NamedCompanion()::class)
        val foo = NamedCompanion.Foo
        val outer = NamedCompanion

        Assertions.assertThat(foo is NamedCompanion.Foo).isTrue()
//        Assertions.assertThat(NamedCompanion() is outer).isTrue()
    }
}