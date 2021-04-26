package boostcourse2.chapter1.section2

class Bird1 {
    var name: String
    var wing: Int
    var beak: String

    constructor(name: String, wing: Int, beak: String) { // 부 생성자 1
        this.name = name
        this.wing = wing
        this.beak = beak
    }

    constructor(name: String, wing: Int) { // 부 생성자 2
        this.name = name
        this.wing = wing
        this.beak = "short"
    }

/*    init { // 실행 시간이 오래 걸리는 코드가 들어가면 객체 생성 시간이 오래 걸림
        println("------------ init start ------------")
        name = name.capitalize() // 대문자 변경
        println("name: $name, wing: $wing, beak: $beak")
        println("------------ init end --------------")
    }*/

    // 메서드
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird1("coco", 2, "long")
    val coco2 = Bird1("coco", 2)
//    coco.name = "coco"

    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    coco.fly()

    println("name: ${coco2.name}, wing: ${coco2.wing}, beak: ${coco2.beak}")
}