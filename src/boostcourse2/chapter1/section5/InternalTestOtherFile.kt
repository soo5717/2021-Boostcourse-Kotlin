package boostcourse2.chapter1.section5

// 패키지가 달라지면 같은 모듈 내에서는 import 해서 쓰면 됨
fun main() {
    val otheric = InternalClass()
    println(otheric.i)
    otheric.icFunc()
}