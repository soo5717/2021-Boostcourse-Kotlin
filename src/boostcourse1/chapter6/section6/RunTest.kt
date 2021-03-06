package boostcourse1.chapter6.section6

fun main() {
    // apply와 run 비교
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    // apply 테스트
    val retrunObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success" // 사용되지 않음
    }
    println(person)
    println("retrunObj: $retrunObj")

    // run 테스트
    val retrunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2: $retrunObj2")
}