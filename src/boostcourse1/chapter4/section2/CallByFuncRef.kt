package boostcourse1.chapter4.section2

// 어려운 부분이니까 잘 보기!
fun main() {
    // 1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum1)
    println(res1)

    // 2. 인자가 없는 함수
    hello(::text) // 반환값이 없음

    // 3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum1
    println(likeLambda(6,6))
}

fun sum1(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}