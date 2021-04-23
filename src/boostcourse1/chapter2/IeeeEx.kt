package boostcourse1.chapter2

fun main() {
    var num: Double = 0.1

    for (x in 0..999) { // 0부터 999까지 반복
        num += 0.1 // 예상 결과 값 => 100
    }

    // 부동 소수점 연산의 단점을 보여줌
   println("num = $num") // 실제 결과 값 => 100.09999999999859
}