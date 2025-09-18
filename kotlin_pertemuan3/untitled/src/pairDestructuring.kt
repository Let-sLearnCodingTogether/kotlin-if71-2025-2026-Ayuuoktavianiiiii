fun main() {
    val firstUser: Pair<String, Byte> = Pair("user1", 20)

    //destructuring
    val (username, age) = firstUser

    println(username)
    println(age)

    //triple destructuring

    val secondUser : Triple<String, Int, String> = Triple("user 1", 30, "female" )

    println(secondUser.first)
    println(secondUser.second)
    println(secondUser.third)

}