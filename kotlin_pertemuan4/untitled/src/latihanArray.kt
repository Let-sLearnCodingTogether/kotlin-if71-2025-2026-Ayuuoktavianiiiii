fun main() {
    //Buat array nama hari
    val hari = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    //Cetak jumlah elemen dalam array
    println("=========================")
    println("Jumlah hari : ${hari.size}")

    // Cetak hari pertama dan hari terakhir
    println("Hari pertama : ${hari.first()}")
    println("Hari terakhir : ${hari.last()}")

    // "Jumat" menjadi "Jumat Barokah"
    val indexJumat = hari.indexOf("Jumat")
    if (indexJumat != -1) {
        hari[indexJumat] = "Jumat Barokah"
        println(hari[indexJumat])
    }
    println("=========================")
}