package boostcourse1.chapter2

fun main() {
    var test: Number = 12.2 // Float 스마트 캐스트
    println("$test")

    test = 12 // Int 스마트 캐스트
    println("$test")

    test = 120L // Long 스마트 캐스트
    println("$test")

    test += 12.0f // Float 스마트 캐스트
    println("$test")
}