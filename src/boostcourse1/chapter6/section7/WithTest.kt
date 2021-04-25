package boostcourse1.chapter6.section7

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    // with 테스트트
   val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
       // 반환이 없어서 Unit이 반환 됨
    }
    println(user)
    println("result: $result")
}