fun main() {
    // Asking the user to enter their name
    print("Enter your name: ")
    val name = readlnOrNull() // Reads the user input for name

    // Asking the user to enter their age
    print("Enter your age: ")
    val age = readlnOrNull()?.toIntOrNull() // Reads the user input for age and converts it to an integer

    // Check if age input is valid
    if (age != null) {
        // Prints a greeting message with the user's name and age
        println("Hello, $name! You are $age years old.")
    } else {
        // If the age is not valid (e.g., not a number), print an error message
        println("Invalid age input. Please enter a valid number for age.")
    }
}