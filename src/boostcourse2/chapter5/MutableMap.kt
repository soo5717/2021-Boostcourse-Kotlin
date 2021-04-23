package boostcourse2.chapter5

fun main() {
// 가변형 Map 의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> // 선언 시 키와 값의 자료형을 명시할 수 있음
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values) // 값만 출력
    println(capitalCityMap.keys) // 키만 출력
    capitalCityMap.put("UK", "London") // 요소의 추가
    capitalCityMap.remove("China") // 요소의 삭제
    println(capitalCityMap)
}