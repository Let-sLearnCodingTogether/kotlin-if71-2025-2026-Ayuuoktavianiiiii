fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "kotlin",
        "kalkulus",
        "Algoritma dan Struktur data"
    )

    println("List matakuliah wajib : $mataKuliahWajib")
    println("Size List matakuliah wajib : ${mataKuliahWajib.size}")

    println("index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $mataKuliahUppercase")

    val mataKuliahLebihdariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }

    println("MataKuliah lebih dari 10 karakter : $mataKuliahLebihdariNKarakter")
}