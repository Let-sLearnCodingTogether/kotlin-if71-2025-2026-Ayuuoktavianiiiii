fun main() {
    var totalBelanja = 0.0
    println("Status Awal -> Total Belanja: Rp$totalBelanja")

    // 1. Pelanggan membeli 3 item dengan harga 25000 per item
    totalBelanja += 3 * 25000
    println("Setelah Item A -> Total Belanja: Rp$totalBelanja")

    // 2. Pelanggan membeli 2 item lain dengan harga 15000 per item
    totalBelanja += 2 * 15000
    println("Setelah Item B -> Total Belanja: Rp$totalBelanja")

    // 3. Diskon sebesar 10000
    totalBelanja -= 10000
    println("Setelah Diskon -> Total Belanja: Rp$totalBelanja")

    // 4. Biaya layanan = totalBelanja / 100
    val biayaLayanan = totalBelanja / 100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")

    // 5. Cetak total akhir
    println("\n===============================")
    println("Total Akhir yang Harus Dibayar: Rp$totalBelanja")
    println("===============================")
}