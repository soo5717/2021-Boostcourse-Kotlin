package boostcourse2.chapter3.section1

interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    var species: String
    val msgTags: String // val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"
    fun feeding() // 마찬가지로 추상 메서드
    fun patting() { // 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") // 구현부
    }
}

class Cat(override var category: String) : Pet {
    override var species: String = "cat"

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("small")
    println("Pet Category: ${obj.category}")
    obj.feeding() // 구현된 메서드
    obj.patting() // 기본 메서드
}