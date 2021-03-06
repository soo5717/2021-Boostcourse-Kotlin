package boostcourse1.chapter4.section2

// 여기 헷갈리는 부분이니까 잘 보기!
fun main() {
    val result = callByName(otherLambda) // 람다식 이름으로 호출
    println(result)
}
fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}
val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}