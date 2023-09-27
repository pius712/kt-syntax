package com.example.syntax.collection

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class ListTest {


    // 애초에 immutable list 에는 add 같은 메서드가 없음.
    @Test
    fun immutableListTest () {
        val immutableList: List<Int> = listOf()

        val addedList = immutableList.plus(3)

        assertThat(immutableList.size).isEqualTo(0)
        assertThat(addedList.size).isEqualTo(1)

    }


    @Test
    fun mutableTest() {
        val mL =  mutableListOf<Int>()
        mL.add(3)

        assertThat(mL.size).isEqualTo(1)
    }
}