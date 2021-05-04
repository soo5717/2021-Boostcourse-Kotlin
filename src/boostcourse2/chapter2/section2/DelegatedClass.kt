package boostcourse2.chapter2.section2

interface Car { // 인터페이스
    fun go(): String // 오버라이드를 위해 인터페이스에서 open 키워드 필요 없음
}

class VanImpl(val power: String): Car {
    override fun go() = "는 짐을 적재하며 $power 마력을 가집니다."
}

class SportImpl(val power: String): Car {
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}") // ① 참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}

// 위임을 사용하지 않을 경우
/*class CarModel(val model: String, private val impl: Car): Car {
    // 여기에 위임을 하면 내부 구현 go가 우선시 됨.
    override fun go(): String {
        return "TEST"
    }
    fun carInfo() {
        println("$model ${go()}") // ① 참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}*/

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))
    myDamas.carInfo() // ② carInfo에 대한 다형성을 나타냄
    my350z.carInfo()
}