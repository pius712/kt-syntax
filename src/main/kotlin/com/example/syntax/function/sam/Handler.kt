package com.example.syntax.function.sam

class Handler {

    fun handle(onHandle: OnHandle) {
        onHandle.handle()
    }

    fun handle2(onHandle: () -> Unit) {
        onHandle();
    }
}