package boostcourse1.chapter5.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 한 줄 입력
    var grade: Char = 'F'

    // 비교 연산자, 논리 연산자 복합
    if(score > 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}