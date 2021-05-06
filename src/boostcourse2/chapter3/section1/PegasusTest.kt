package boostcourse2.chapter3.section1

interface Bird {
    val wings: Int
    fun fly()
    fun jump() = println("bird jump!") // 일반 메서드
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump() = println("jump!, max speed: $maxSpeed") // 일반 메서드
}

class Pegasus: Bird, Horse { // Bird와 Horse 인터페이스 다중 상속
    override val wings: Int = 2
    override val maxSpeed: Int = 100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump() // 구현부 포함하기 위헤 super 사용
        println("and Jump!")
    }
}