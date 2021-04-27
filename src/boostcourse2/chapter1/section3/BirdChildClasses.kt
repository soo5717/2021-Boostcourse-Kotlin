package boostcourse2.chapter1.section3

open class Bird(var name: String, var wing: Int, var beak: String) {

    open fun fly() = println("Fly")
}

class Lark(name: String, wing: Int, beak: String, var language: String): Bird(name, wing, beak) {

    override fun fly() {
        super.fly()
        println("Quick Fly")
    } // 오버라이드

    fun sing() = println("Sing")
}

class Parrot: Bird {
    // Parrot만의 프로퍼티
    var language: String

    // 반드시 super를 사용해야 함
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language
    }

    fun speak() = println("Speak: $language")
}

fun main() {
    val lark: Bird = Lark("my lark", 2, "short", "kor")
    val parrot = Parrot("my parrot", 2, "long", "eng")

//    println("lark => name: ${lark.name}, language: ${lark.language}")
    println("parrot => name: ${parrot.name}, language: ${parrot.language}")

//    lark.sing()
    lark.fly() // 오버라이드 된 fly가 호출 됨

    parrot.speak()
    parrot.fly()
}