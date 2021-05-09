package boostcourse2.chapter4.section2

import java.util.Arrays

fun main() {
//    val b = Array(10,{0}) // 단일 자료형 가능
    val b = Array<Any>(10,{0}) // 다양한 자료형 가능
    println(Arrays.toString(b))

    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0]) // Hello World
    println(b[1]) // 1.1
    println(b[2]) // 0

    println(Arrays.toString(b))
}
