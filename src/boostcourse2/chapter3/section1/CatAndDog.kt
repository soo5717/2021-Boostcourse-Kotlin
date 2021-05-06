package boostcourse2.chapter3.section1

open class Animal(val name: String) // 상속 가능한 클래스

// ① feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Master {
/*    fun playWithPet(pet: Dog) { // ② 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat) { // ③ 고양이를 위한 메서드
        println("Enjoy with my cat.")
    }*/
    fun playWithPet(pet: Pet) { // 인터페이스를 객체로 매개변수 지정
        println("Enjoy with my ${pet.species}")
    }
}
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco")
    master.playWithPet(dog)
    master.playWithPet(cat)
}