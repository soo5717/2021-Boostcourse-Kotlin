package boostcourse1.chapter4.section1

fun main() {
    val result: Int

//    val multi = { a: Int, b: Int -> a * b}
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b // return 부분
    }

    val nestedLambda: () -> () -> Unit = { { println("Nested Lambda") }}

    result = multi(10, 20) // 람다식을 함수처럼 사용 가능
    println(result)

    nestedLambda()() // 호출하는 법 기억하기!
}