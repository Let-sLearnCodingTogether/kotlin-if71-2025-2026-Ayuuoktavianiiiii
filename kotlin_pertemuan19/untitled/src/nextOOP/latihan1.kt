package nextOOP

interface Electronic {
    var brand: String

    fun turnOn()
    fun turnOff()

    fun cleanDevice() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override var brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override var brand: String) : Electronic {
    override fun turnOn() {
        println("Lampu pintar merek $brand menyala")
    }

    override fun turnOff() {
        println("Lampu pintar merek $brand mati")
    }
}

fun main() {
    val kipas = Fan("LG")
    kipas.turnOn()
    kipas.turnOff()
    kipas.cleanDevice()

    println("============================")
    val lampu = SmartLight("Philips ")
    lampu.turnOn()
    lampu.turnOff()
    lampu.cleanDevice()
}