package ch3

/*
    검증 로직을 확장 함수로 추출

    - 검증 로직이 User를 사용하는 다른 곳에서는 쓰이지 않는 기능이기 떄문에
    - User에 포함시키고 싶지는 않다.
    - 이럴 떄 확장함수를 사용
 */

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id}, empty ${fieldName}")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser4(user: User){
    user.validateBeforeSave()
}
