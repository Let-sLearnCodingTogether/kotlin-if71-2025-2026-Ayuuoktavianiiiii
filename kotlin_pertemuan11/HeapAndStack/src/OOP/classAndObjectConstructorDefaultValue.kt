package OOP

class MahasiswaConstruktorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
) {
    init {
        println("ini Block Init")
    }
}
fun main() {
    val mahasiswaPertama = MahasiswaConstruktorDefaultValue(
        npm = "2125250073",
        nama = "Mahasiswa Pertama"
    )

    val mahasiswakedua = MahasiswaConstruktorDefaultValue(
        "2125250074",
        nama = "mahasiswa kedua"
    )
}