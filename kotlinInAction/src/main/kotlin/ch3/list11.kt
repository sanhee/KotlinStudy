package ch3

import java.lang.IllegalArgumentException

/*
    3.6 로컬 함수와 확장

    - 흔히 발생하는 코드 중복을 로컬 함수를 통해 어떻게 제거할 수 있는지 살펴보자.

    자바 코드를 작성할 때 메소드 추출을 통해 각 부분을 재활용할 수 있다.
    하지만 클래스안에 작은 메소드가 많아지고, 메소드 사이 관계 파악이 힘들어서 더 어려워질 수 있다.
    추출한 메소드를 내부 클래스에 넣는 기법도 있지만, 역시 불필요한 준비 코드가 늘어난ㄷ.

    코틀린에서는 함수에서 추출한 함수를 원 함수 내부에 중첩시킬 수 있다.
 */


// 코드 중복을 보여주는 예제

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if(user.address.isEmpty()){
        throw IllegalArgumentException("Can't save address ${user.id}: empty address")
    }
}

fun main(){
    saveUser(User(1, "", ""))
}
