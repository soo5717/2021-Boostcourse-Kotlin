package boostcourse1.chapter2

// 헷갈릴 수 있는 부분이니까 슬라이드 참조해서 이해하기 P29
fun main() {
    val a: Int = 128
    val b = a // Int 형으로 추론

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d) // True
    println(c === d) // False
    println(c === e) // True
}