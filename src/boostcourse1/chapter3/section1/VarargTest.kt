package boostcourse1.chapter3.section1

fun normalVarargs(vararg a: Int) { // 가변 인자
    for (num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1, 2, 3, 4)
}