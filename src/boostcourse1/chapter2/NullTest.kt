package boostcourse1.chapter2

fun main() {
    var str1 : String? = "Hello Kotlin"

    // safe (?.) calls => null 일 경우 실행하지 않음
    str1 = null // null 허용
    println("str1: $str1, length: ${str1?.length}")

    // non-null asserted (!!.) calls => null 일리 없다고 가정
    str1 = "Hello"
    println("str1: $str1, length: ${str1!!.length}")

    // if-else 검증
//    val len = if (str1 != null) str1.length else -1
    val len = str1?.length ?: -1 // 엘비스 연산자
    println("str1: $str1, length: $len")
}
