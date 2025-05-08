fun main() {
    // Create a map with student names as keys and their scores as values
    val studentScores = mapOf(
        "Peace" to 60,
        "Aisha" to 73,
        "Zainab" to 75,
        "Fatima" to 89
    )

    // Print students who scored above 70
    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name: $score")
        }
    }
}
