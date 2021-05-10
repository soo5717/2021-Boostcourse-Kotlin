package boostcourse2.chapter5.section1

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    println(numbers.size) // List 크기
    println(numbers.get(0)) // 해당 인덱스의 요소 가져오기
    println(numbers.indexOf(2)) // 해당 요소의 인덱스 가져오기
    println(numbers.contains(5)) // 포함 여부 확인 후 포함되어 있으면 true 반환

    println()

    println(names.size) // List 크기
    println(names.get(0)) // 해당 인덱스의 요소 가져오기
    println(names.indexOf("three")) // 해당 요소의 인덱스 가져오기
    println(names.contains("two")) // 포함 여부 확인 후 포함되어 있으면 true 반환
}