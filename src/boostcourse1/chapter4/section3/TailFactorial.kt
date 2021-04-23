package boostcourse1.chapter4

fun main() {
    val number = 4
//    val result: Long
//    result = factorial(number)
//    println("Factorial: $number -> $result")
    println("Factorial: $number -> ${factorial(number)}")
}

// 일반적인 재귀함수
/*
fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n-1)
}*/

// 꼬리 재귀함수
tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}
