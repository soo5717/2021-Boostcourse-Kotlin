package boostcourse1.chapter4.section4

var global = 10

fun main() {
    global = 15
    println("global $global")

    userFunc()
    println("final - global $global")
}

fun userFunc() {
    global = 20
    println("userFunc - global $global")
}