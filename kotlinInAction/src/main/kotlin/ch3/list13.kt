package ch3

/*
    로컬 함수에서 바깥 함수의 파라미터 접근하기
 */

fun saveUser3(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}, empty ${fieldName}")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}
