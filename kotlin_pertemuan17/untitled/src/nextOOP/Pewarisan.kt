package nextOOP

open class Hewan(val name : String) {
     open fun suara() {
        println("Suara Hewan")
    }
}

open class Ayam(name : String) : Hewan(name) {
   override fun suara(){
        println("kuku ruyuk")
    }
}

//class AnakAyam(name : String) : Ayam(name) {
//    override fun suara() {
//        println("petok petok")
//    }
//}

fun main() {
    val rambo = Ayam(name = "rambo")
    rambo.suara()
}