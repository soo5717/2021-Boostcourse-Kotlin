package boostcourse1.chapter5.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 한 줄 입력
    var grade: Char = 'F'

    // 범위 연산자
/*    grade = when {
        score > 90.0 -> {
            'A'
        }
        score in 80.0..89.9 -> {
            'B'
        }
        score in 70.0..79.9 -> {
            'C'
        }
        else -> {
            'F'
        }
    }*/

    grade = when(score) {
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'A'
        in 70.0..79.9 -> 'A'
        else -> 'F'
    }
    println("score: $score, grade: $grade")
}