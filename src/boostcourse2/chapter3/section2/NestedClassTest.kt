package boostcourse2.chapter3.section2

class Outer {
    val ov = 5
    // 자바에서 static 클래스와 같음.
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에는 접근 불가

        // companion object로 선언한 것은 접근 가능
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }
    fun outside() {
        val msg = Nested().greeting() // Outer 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근
    }
    companion object {
        const val country = "Korea"
        fun getSomething() {
            return println("Get something")
        }
    }
}

fun main() {
    // static 처럼 Outer의 객체 생성 없이 Nested객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 에러! Outer 객체 생성 필요
    val outer = Outer()
    outer.outside()
    Outer.Nested().accessOuter()
}