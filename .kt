// Examples of Strings in Kotlin
fun main() {
    val name = "John"
    val age = 30

    // Concatenation
    val greeting = "Hello, my name is $name and I am $age years old."
    println(greeting)

    // String methods
    val uppercaseName = name.toUpperCase()
    println("My name in uppercase is $uppercaseName")

    val fullName = "$name Doe"
    val indexOfSpace = fullName.indexOf(" ")
    val firstName = fullName.substring(0, indexOfSpace)
    println("My first name is $firstName")
}
