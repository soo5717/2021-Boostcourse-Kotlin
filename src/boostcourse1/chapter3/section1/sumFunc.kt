package boostcourse1.chapter3.section1

// 모두 같은 기능이지만 아래로 갈 수록 간략화 시킴
fun sum1(a: Int = 2, b: Int = 5): Int { // Default 설정 가능!
    var sum = a + b
    return sum
} // 최상위 함수

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum3(a: Int, b:Int): Int = a + b

fun sum4(a: Int, b: Int) = a + b

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun outFunc(name: String): Unit { // return 없음 => Unit 생략 가능
    println("Name: $name")
}

fun main() { // 최상위 (Top-level) 함수
    val result1 = sum1(2, 3)
    val result3 = sum1(b = 2) // 지정해서 값 넣기

    val a = 3
    val b = 5
    val result2 = max(a, b)

    println("result1 = $result1")
    println("result2 = $result2")
    println("result3 = $result3")
    outFunc("Kildong")

    fun sum5(a: Int, b: Int): Int {
        return a + b
    } // 지역 함수
}