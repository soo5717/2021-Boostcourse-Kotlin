package boostcourse2.chapter1.section1

class Car {
    val wheel: Int = 4

    fun start() {
        println("Engine Start!")
    }
}

fun main() {
    val sonata: Car = Car() // 객체 생성
    println(sonata.wheel)
    sonata.start()
}

