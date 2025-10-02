fun main() {
    val ages: Array<Int> = arrayOf(60, 25, 30, 40, 50)


    //ages.sort
    ages.sorted()
    println("Ages sort : ${ages.joinToString()}")

    ages.reverse()
    println("Ages reverse : ${ages.joinToString()}")

    println("slice : ${ages.slice(indices = 2 .. 4).joinToString()}")

}