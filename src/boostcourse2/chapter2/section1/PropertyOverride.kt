package boostcourse2.chapter2.section1

open class First {
    open val x: Int = 0 // ① 오버라이딩 가능
        get() {
            println("First x")
            return field
        }
    val y: Int = 0 // ② open 키워드가 없으면 final 프로퍼티임
}
class Second : First() {
    override var x: Int = 0 // ③ 부모와 구현이 다름 => var로 변경 가능
        get() {
            println("Second x")
            return field + 3
        }
        set(value) {
            field = value + 10
        }
// override val y: Int = 0 // ④ 에러! 오버라이딩 불가
}
fun main() {
    val second = Second()
    println(second.x) // ⑤ 오버라이딩된 두번째 클래스 객체의 x
    second.x = 10
    println(second.x) // 23 출력
    println(second.y) // 부모로 부터 상속 받은 값
}