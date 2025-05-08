fun main() {
    // Ask the user to enter a number
    print("Enter a number: ")

    // Read the input number from the user
    val number = readln().toInt()

    // Check if the number is even or odd
    if (number % 2 == 0) {
        // If the remainder when divided by 2 is 0, the number is even
        println("The number $number is Even.")
    } else {
        // If the remainder when divided by 2 is not 0, the number is odd
        println("The number $number is Odd.")
    }
}
