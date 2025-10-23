package oop

class PersegiPanjang(val panjang : Double, val lebar : Double){
    val luas: Double
        get() = panjang * lebar
}

fun main() {
    val persegi = PersegiPanjang(6.0, 2.0)
    println("Panjang : ${persegi.panjang}")
    println("Lebar : ${persegi.lebar}")
    println("Luas : ${persegi.luas}")
}