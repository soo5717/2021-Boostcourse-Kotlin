package boostcourse1.chapter4.section2

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

fun funcFunc(a: Int, b: Int) = sum(a, b)

fun main() {
    val result1 = sum(10, 10)
    val result2 = mul(sum(10, 5), 10)
    val result3 = funcFunc(2, 3)

    println("result1: $result1, result2: $result2, result3: $result3")
}