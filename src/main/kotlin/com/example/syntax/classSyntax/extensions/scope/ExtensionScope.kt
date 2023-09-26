package com.example.syntax.classSyntax.extensions.scope

import com.example.syntax.classSyntax.extensions.Extension
import com.example.syntax.classSyntax.extensions.age

class ExtensionScope(val ex: Extension) {


    // import가 필요함.
    fun foo() {
        ex.age
    }
}