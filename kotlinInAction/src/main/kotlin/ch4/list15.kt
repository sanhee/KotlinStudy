package ch4

/*
    세터에서 뒷받침하는 필드 접근하기

    - 값을 저장하는 동시에 로직 실행
    - 로그 남기기

 */

class User2(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
            Address was changed for $name: 
            "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main() {
    val user = User2("Alice")
    user.address = "새로운 주소"
    // Address was changed for Alice:
    //"unspecified" -> "새로운 주소".
    user.address = "새로운 주소2"
}
