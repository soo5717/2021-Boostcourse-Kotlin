package boostcourse2.chapter6

// ① Thread클래스를 상속받아 구현하기
class SimpleThread: Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}
// ② Runnable 인터페이스로부터 run() 구현하기
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}
fun main(args: Array<String>) {
    val thread = SimpleThread()
    thread.start()
    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()
}