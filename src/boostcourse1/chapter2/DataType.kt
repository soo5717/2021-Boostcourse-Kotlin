package boostcourse1.chapter2

fun main() {
    val username1: String = "Kildong" //상수
    var username2 = "Kildong" //변수 => 타입 추론 가능
    username2 = "Dooly"

    // ${변수 or 식} => 만약 하나인 경우 중괄호 생략 가능
    println("username1 = $username1")
    println("username2 = $username2")
}