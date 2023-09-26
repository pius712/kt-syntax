package com.example.syntax.classSyntax.extensions

import org.junit.jupiter.api.Test

class InsideExtensionTest {


    @Test
    fun InsideExtensionTest()  {
        val outside = Outside()
        val insideExtension = InsideExtension(outside)

        insideExtension.greet()
    }
}