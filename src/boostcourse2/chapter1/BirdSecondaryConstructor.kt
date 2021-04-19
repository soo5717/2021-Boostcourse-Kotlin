package boostcourse2.chapter1

class Bird2 {
    // ① 프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // ② 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name // ③ this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val coco = Bird2("mybird", 2, "short", "blue") // ④ 생성자의 인자로 객체 생성과 동시에 초기화
}