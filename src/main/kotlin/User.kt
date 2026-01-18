package org.example

class User(val name: String, val age: Int) {
    init {
        require(age >= 18) { "User must be adult" }
    }
}