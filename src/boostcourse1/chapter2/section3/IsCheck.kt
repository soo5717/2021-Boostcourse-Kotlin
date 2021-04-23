package boostcourse1.chapter2.section4

fun main() {
    val num = 256

    if (num is Int) { // Int 일 경우
        print(num)
    } else if (num !is Int) { // Int 가 아닐 경우 !(num is Int) 와 동일함.
        print("Not a Int")
    }
}