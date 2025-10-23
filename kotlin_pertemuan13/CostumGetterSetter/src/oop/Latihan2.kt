package oop

class Mahasiswa {
    var ipk : Double = 0.0
        set(value) {
            field = if(value < 0.0) 0.0 else if (value > 4.0) 4.0 else value
        }
}

fun main() {
    val mhs1 = Mahasiswa()
    mhs1.ipk = -3.8
    println("IPK MINUS : ${mhs1.ipk}")
    mhs1.ipk = 4.2
    println("IPK LEBIH DARI 4.0 : ${mhs1.ipk}")
    mhs1.ipk = 3.5
    println("${mhs1.ipk}")

}