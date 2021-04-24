package boostcourse1.chapter5.section2

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt() // Int 아닌 값이 들어오면 예외 발생할 수 있음
    var factorial: Long = 1

    while (number > 0) { // n × ... × 4 × 3 × 2 × 1
        factorial *= number
        --number
    }
    println("Factorial: $factorial")
}