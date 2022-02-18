package ch3


/*
    로컬 함수를 사용해 코드 중복 줄이기
 */

fun saveUser2(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}, empty ${fieldName}")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun main() {
    saveUser2(User(1, "", ""))
}
