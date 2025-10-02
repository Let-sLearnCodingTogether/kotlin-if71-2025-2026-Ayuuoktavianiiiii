fun main() {
    // null
    var student : String = "Ayu"
    println(student)

   // student = null

    var prodiIf : String? = null
    println(prodiIf?.length)

    var prodiSi : String? = "Informatika" //elvis operator
    println(prodiSi ?: "Tanpa Prodi")

    var token : String? = null
    println(token!!.length)

    //smart cast
    val email: String? = "email"
    if(email != null){
        print(email.length)
    }

}