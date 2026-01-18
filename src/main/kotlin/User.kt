package org.example

class User(val name: String, val age: Int = 18) {
    init {
        require(age >= 18) { "User must be adult" }
    }
}

/*
class User(
    val name: String,
    val age: Int = 18,
    val country: String = "India"
)
*/

//Above is equivalent to below code   ** MAGIC OF DEFAULT PARAMETERS **

/*
constructor(name: String)
constructor(name: String, age: Int)
constructor(name: String, age: Int, country: String)
 */