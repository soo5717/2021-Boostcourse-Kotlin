package boostcourse1.chapter2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    // ==는 값만 비교, ===는 참조까지 비교
    println("str1 === str2: ${str1 === str2}") // False
    println("str1 === str3: ${str1 === str3}") // True
}