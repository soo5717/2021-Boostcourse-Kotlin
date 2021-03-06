package boostcourse2.chapter5.section2

import java.util.*

fun main() {
    // 자바의 java.util.TreeSet 선언 => 기본적으로 오름차순 정렬
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = $intsSortedSet")
    intsSortedSet.clear() // 모든 요소 삭제
    println("intsSortedSet = $intsSortedSet")
}