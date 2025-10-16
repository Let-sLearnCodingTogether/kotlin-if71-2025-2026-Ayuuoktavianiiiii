package OOP

class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2125250073",
        nama = "Ayu Sri oktaviani",
        ipk = 4.0f,
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 3.9f
    println(mahasiswaPertama.ipk)
}