package boostcourse1.chapter3.section3

fun highFunc1(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b) // sum 매개변수는 함수

fun highFunc2(a: Int, b: Int, sum: (Int, Int) -> Int): Int = sum(a, b) // sum 매개변수는 함수

fun main() {
    println(highFunc1({ x, y -> x + y }, 10, 20)) // 람다식 함수를 인자로 넘김

    val result = highFunc2(10, 20) { x, y ->
        x + y
    } // 소괄호 사이에서 빼서 다음과 같은 형식으로도 작성 가능!
    println(result)
}