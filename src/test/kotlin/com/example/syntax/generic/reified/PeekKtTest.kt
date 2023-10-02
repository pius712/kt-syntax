package com.example.syntax.generic.reified

import com.example.syntax.generic.upperbound.UnboundedBox
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PeekKtTest {

    @Test
    fun inlineReifiedTest() {
        val box = UnboundedBox<Any?>()
        box.save(null);
        box.save(10)

        val b = box.assertBy<Int>(1)

        Assertions.assertThatThrownBy { box.assertBy<Int>(0) }.isInstanceOf(RuntimeException::class.java);
        Assertions.assertThat(b).isEqualTo(10)
    }

}