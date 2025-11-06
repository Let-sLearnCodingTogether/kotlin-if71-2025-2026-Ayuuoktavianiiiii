package nextOOP

open class Pegawai( val nama : String, val gajiDasar: Double ){
    open fun HitungGaji(): Double{
        return gajiDasar
    }
}

class Manager(nama: String, gajiDasar: Double):
        Pegawai(nama, gajiDasar) {
    override fun HitungGaji(): Double {
        return gajiDasar
    }
}

class Programmer(nama : String, gajiDasar: Double):
        Pegawai(nama, gajiDasar){
    override fun HitungGaji(): Double {
        return gajiDasar
    }
}

fun main() {
    val manager = Manager("Ayu", 5000000.0 )
    val programmer = Programmer( "Dea", 4000000.0)
    val programmer1 = Programmer( "Dicky", 4500000.0)

    println("Gaji ${manager.nama} = Rp. ${manager.HitungGaji()}")
    println("Gaji ${programmer1.nama} = Rp. ${programmer1.HitungGaji()}")

    val daftarPegawai = listOf(manager,programmer,programmer1)

    println("------------ Daftar pegawai dan Gaji Total------------ ")
    for (pegawai in daftarPegawai){
        println("${pegawai.nama} memiliki total gaji: ${pegawai.HitungGaji()}")
    }
}
