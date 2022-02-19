package ch4

/*
     가시성 변경자: 기본적으로 public

     - 자바의 기본 가시성인 package-private은 코틀린에 없다.
     - 코틀린은 패키지를 namepsace를 관리하기 위한 용도로만 사용
     - 차이점
        - 코틀린에서는 최상위 선언에 대해 private 가시성을 허용한다.
        - private 최상위 선언은 그 선언이 들어있는 파일 내부에서만 사용할 수 있음

 */

private val age: Int = 28

private fun methodA() {
    println("private methodA")
}

private class Person (private val name: String){
    public fun say(){
        println("안녕하세요, 저는 ${name}입니다.")
        println("나이: ${age}")
        methodA()
    }
}

fun main() {
    val p = Person("박산희")
    p.say()
}
