package boostcourse2.chapter4.section1

open class Parent // 상위 클래스

class Child: Parent() // 하위 클래스

class Cup<T>

fun main() {
    val obj1: Parent = Child() // Parent 형식의 obj1은 Child로 형 변환될 수 있음
//    val obj2: Child = Parent() // 에러! 하위 형식인 Child의 객체 obj2는 Parent로 변환되지 않음
//    val obj3: Cup<Parent> = Cup<Child>() // 에러! 자료형 형식이 일치하지 않음
//    val obj4: Cup<Child> = Cup<Parent>() // 에러! 자료형 형식이 일치하지 않음
    val obj5 = Cup<Child>() // obj5는 Cup<Child> 형식이 됨
    val obj6: Cup<Child> = obj5 // 형식이 일치하므로 Ok!
}