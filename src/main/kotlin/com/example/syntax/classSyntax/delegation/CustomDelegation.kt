package com.example.syntax.classSyntax.delegation

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CustomDelegation {

    val greet: String by CustomDel()
    var greet2: String by CustomDel2()
}

class CustomDel2 : ReadWriteProperty<CustomDelegation, String> {
    private var _value: String? = null
    override fun getValue(thisRef: CustomDelegation, property: KProperty<*>): String {
        if (_value == null) {
            this._value = "hi"
            return "hello"
        }
        return _value as String;
    }

    override fun setValue(thisRef: CustomDelegation, property: KProperty<*>, value: String) {
        TODO("Not yet implemented")
    }

}

class CustomDel : ReadOnlyProperty<CustomDelegation, String> {
    override fun getValue(thisRef: CustomDelegation, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

}
