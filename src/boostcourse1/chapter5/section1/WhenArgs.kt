package boostcourse1.chapter5.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    // 인수 있는 when의 사용
    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}