fun main() {
    // Define a lambda expression to calculate the product of two integers
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    // Call the lambda with two integers and print the result
    val result = multiply(4, 5)
    println("The product of 4 and 5 is: $result")
}
