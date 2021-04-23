package boostcourse1.chapter4.section3

// PPT P21 참조해서 noinline 과 crossinline도 잘 이해해야 함.
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("Goodbye")
}

fun main() {
    shortFunc(3) { a -> println("a: $a") }
    shortFunc(3) {
        println("a: $it")
//        return // shorFunc까지 빠져나와버려서 Goodbye 출력 안됨! => 비지역 반환
    } // 위와 같은 코드
}