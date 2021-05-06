package boostcourse2.chapter3.section1

// 추상 클래스의 선언
abstract class Printer {
    abstract fun print() // 추상 메서드
}

// 하위 클래스 없이 오브젝트로 객체를 생성함
val myPrinter = object: Printer() { // 객체 인스턴스
    override fun print() { // 추상 메서드의 구현
        println("출력합니다.")
    }
}

fun main() {
    // 임시 인스턴스
    myPrinter.print()
}