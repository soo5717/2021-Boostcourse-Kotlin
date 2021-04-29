package boostcourse2.chapter2.section1

// 임시적인 매개변수 (관용적으로 _를 접두사로 함)
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
        get() = field
    var name: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
fun main() {
    val user1 = User(1, "Kildong", 30)
    // user1.id = 2 // 에러! val 프로퍼티는 값 변경 불가
    user1.age = 35 // 세터 동작
    println("user1.age = ${user1.age}") // 게터 동작
}
