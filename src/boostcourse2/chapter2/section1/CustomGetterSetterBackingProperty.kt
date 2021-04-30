package boostcourse2.chapter2.section1.custom

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    // 임시 보조 프로퍼티
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}
fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = "abc"
    println("user3.name = ${user1.name}") // NONAME 출력
}