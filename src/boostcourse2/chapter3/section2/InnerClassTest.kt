package boostcourse2.chapter3.section2

class Smartphone(val model: String) {
    private val cpu = "Exynos" // 내부 클래스는 private도 접근 가능

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
}