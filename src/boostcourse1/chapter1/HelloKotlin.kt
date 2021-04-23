package boostcourse1.chapter1

fun main(args: Array<String>) {
   println("Hello Kotlin!")

   // 매개 변수 없을 시 ArrayIndexOutOfBoundsException 에러 발생
   println("args[0] = ${args[0]}") //명령행 첫번째 인자
   println("args[1] = ${args[1]}") //명령행 두번째 인자
   println("args[2] = ${args[2]}") //명령행 세번째 인자
}