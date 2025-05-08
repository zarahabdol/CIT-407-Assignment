// Base class Person with properties name and age
open class Person(val name: String, val age: Int) {

    // Method to print person's details
    fun printDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass Student that inherits from Person and adds a grade property
class Student(name: String, age: Int, val grade: String) : Person(name, age) {

    // Method to print student details (including grade)
    fun printStudentDetails() {
        // Calling the base class method to print name and age
        printDetails()
        // Printing the additional grade property
        println("Grade: $grade")
    }
}

fun main() {
    // Create a Person object
    val person = Person("Zara", 22)

    // Create a Student object
    val student = Student("Abdullahi", 75, "A+")

    // Print the details of the person
    println("Person Details:")
    person.printDetails()

    // Print the details of the student
    println("\nStudent Details:")
    student.printStudentDetails()
}
