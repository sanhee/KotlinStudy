package ch3

/*
    중위 호출(infix)
     - 확장 함수를 활용
     - 수신 객체와 유일한 메소드 인자 사이에 메소드 이름을 넣는다.

     -> ex) [수신객체] [메소드 이름] [유일한 인자]
     -> ex) 1 to "one"  == 1.to("one")
*/

infix fun Int.add(other: Int):Int = this+other

fun main(){
    println(1.add(2)) // 3
    println(1 add 2) //3,  *중위호출*

    // to 역시 코틀린의 키워드가 아닌 중위 표현식
    val map = mapOf(1 to "one", 7 to "seven")
    val map2 = mapOf(1.to("one")   , 7.to("seven"))
    println(map[1]) // "one"
}
