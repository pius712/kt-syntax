package com.example.syntax.runCatching

class RunThrow {

    fun run(throws: Boolean): Result<String> {

        return runCatching {
            if (throws) {
                throw RuntimeException()
            } else {
                "run";
            }
        }

    }
}