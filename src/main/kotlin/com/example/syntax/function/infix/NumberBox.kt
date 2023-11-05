package com.example.syntax.function.infix

class NumberBox(
        private val number: Long
) {

    infix fun add(number: Long): NumberBox {
        return NumberBox(this.number + number)
    }

    infix fun minus(number: Long): NumberBox {
        return NumberBox(this.number - number)
    }

    infix fun multiple(number: Long): NumberBox {
        return NumberBox(this.number * number)
    }

    infix fun divide(number: Long): NumberBox {
        if (number == 0L) {
            throw RuntimeException("0으로 나눌 수 없습니다.")
        }

        return NumberBox(this.number / number);
    }


    fun get(): Long {
        return this.number
    }
}