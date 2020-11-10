fun main() {
    val quizAnswer1 = 15
    val quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    println("What is 75 / 5?")
    val studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of y in 6 x 2y = 36")
    val studentAnswer2 = Integer.valueOf(readLine())

    println("What triangle has two equal length sides")
    val studentAnswer3 = readLine()

    println("What is the answer to 8 x 6 - (3 - 2)")
    val studentAnswer4 = Integer.valueOf(readLine())

    //calculate score
    var points = 0

    //conditionals can be used in a number of different ways
    if (studentAnswer1 == quizAnswer1) {
        points += 25
    }

    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2 - 1 || studentAnswer2 == quizAnswer2 + 1 ) {
        points += 20
        println("The answer $studentAnswer2 is withing 1 points of $quizAnswer2")
    } else {
        points += 1
    }

    when (studentAnswer3) {
        quizAnswer3 -> points += 25
        "equilateral" -> points += 10
        else -> points += 1
    }

    // we can check studentAnswer in when block instead of passing it in like above
    // also we can set points += before the when block, passing it the correct value after evaluation
    points += when {
        studentAnswer4 == quizAnswer4 -> 25
        studentAnswer4 in 44..54 -> 20
        else -> 1
    }

    // .. is for a range, all val from start the end, also works with Char
    when (points) {
        in 0..59 -> println("Grade: F")
        in 60..69 -> println("Grade: D")
        in 70..79 -> println("Grade: C")
        in 80..89 -> println("Grade: B")
        in 90..100 -> println("Grade: A")
        in 101..110 -> println("Grade: A+")
    }

}