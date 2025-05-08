fun main() {
    // Calling the sum function with different values and displaying the result
    val result1 = sum(6, 8)  // Sum of 6 and 8
    println("The sum of 6 and 8 is: $result1")

    val result2 = sum(14, 20)  // Sum of 14 and 20
    println("The sum of 14 and 20 is: $result2")

    val result3 = sum(17, 7)  // Sum of 17 and 7
    println("The sum of 17 and 7 is: $result3")
}

// Function to return the sum of two numbers
fun sum(a: Int, b: Int): Int {
    return a + b  // Add the two integers and return the result
}
