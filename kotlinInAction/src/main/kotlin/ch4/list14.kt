package ch4

interface User{
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User{
    override val nickname : String
        get() = email.substringBefore("@")
}

fun main() {
    println(PrivateUser("test@noeul.org").nickname)
    println(SubscribingUser("test@noeul.org").nickname)
}
