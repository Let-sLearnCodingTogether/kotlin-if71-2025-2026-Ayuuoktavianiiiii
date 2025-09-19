
    fun main() {
        val idProduct: Long = 9876543210
        val hargaProduk: Double = 3499990.50
        val beratProdukKg: Float = 0.15f

        val jumlahStok: UInt = 250u         // Tidak pernah negatif → pakai Unsigned Int
        val jumlahTerjual: Int = 1843       // Bisa besar, tapi tetap bilangan bulat positif

        val kodeKategori: Byte = 12       // Tidak lebih dari 100 → pakai Unsigned Byte (0..255)
        val tahunRilis: Short = 2025      // Tahun, positif, bisa gunakan Unsigned Short

        // Tampilkan data
        println("ID Produk       : $idProduct")
        println("Harga Produk    : Rp $hargaProduk")
        println("Berat Produk    : $beratProdukKg kg")
        println("Jumlah Stok     : $jumlahStok unit")
        println("Jumlah Terjual  : $jumlahTerjual unit")
        println("Kode Kategori   : $kodeKategori")
        println("Tahun Rilis     : $tahunRilis")
    }
