package boostcourse1.chapter2.section4

fun main() {
    var a: Any = 1 // Any => Int
    a = 20L // Int => Long
    println("a: $a type: ${a.javaClass}") // a의 자바 기본형을 출력하면 long
}