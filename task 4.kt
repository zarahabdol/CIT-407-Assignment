fun main() {
    // Print numbers from 1 to 10 using a for loop
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        println(i)
    }

    // Print only even numbers from 1 to 20
    println("\nEven numbers from 1 to 20:")
    for (i in 1..20) {
        // Check if the number is even (remainder when divided by 2 is 0)
        if (i % 2 == 0) {
            println(i)
        }
    }
}
