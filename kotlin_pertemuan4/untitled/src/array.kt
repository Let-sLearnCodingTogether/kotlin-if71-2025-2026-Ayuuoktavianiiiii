fun main() {
    val users : Array <String> = arrayOf("User 1", "User 2", "User 3")

    println(users[0])
    println(users.get(1)) //mengambil data

    users.set(2, "User 3 Update")
    println(users[2])

    users[2] = "user 3 update lagi"
    println(users[2])

    println("size : ${users.size}")
}