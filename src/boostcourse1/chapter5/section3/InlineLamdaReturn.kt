package boostcourse1.chapter5.section3

fun main() {
    retFunc1()
    retFunc2()
}
inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}
fun retFunc1() {
    println("start of retFunc") // ①
    inlineLambda(13, 3) { a, b -> // ②
        val result = a + b
        if(result > 10) return // ③ 10보다 크면 이 함수를 빠져 나감
        println("result: $result") // ④ 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc") // ⑤ 비지역 반환 때문에 실행되지 않음
}

// 라벨 사용한 방식! 잘 봐두기
fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> // ① 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // ② 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    }
    println("end of retFunc") // ④ 이 부분이 실행됨
}