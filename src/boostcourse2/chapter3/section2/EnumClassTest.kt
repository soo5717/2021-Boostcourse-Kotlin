package boostcourse2.chapter3.section2

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score { // Score를 구현할 열거형 클래스
    NORMAL("Thrid") {
        override fun getScore(): Int = 100 // 구현된 메서드
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD) // GOLB 출력
    println(MemberType.valueOf("SILVER")) // SIVER 출력
    println(MemberType.SILVER.prio) // Second 출력

    for (grade in MemberType.values()) { // 모든 값을 가져오기 위한 반복문
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}