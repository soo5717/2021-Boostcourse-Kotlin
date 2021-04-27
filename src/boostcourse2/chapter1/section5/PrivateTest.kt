package boostcourse2.chapter1.section5

private class PrivateTest {
    private var i = 1

    private fun privateFunc() {
        i += 1
        println(i)
    }
    fun access() { //Public 클래스
        privateFunc()
    }
}

// 분리된 클래스에서 Private 클래스 객체 공개 생성 불가능
class OtherClass {
//   val pc = PrivateTest() // 공개 생성 불가
//   private val pc = PrivateTest() // 생성 가능
    fun test() {
        val pc = PrivateTest()
//        pc.privateFunc()
        pc.access()
    }
}

// 최상위 함수에서는 Private 클래스 객체 생성 가능
fun main() {
    val pc = PrivateTest()
    pc.access()
}