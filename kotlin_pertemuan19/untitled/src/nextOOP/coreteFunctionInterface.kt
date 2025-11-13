package nextOOP

interface SpaceVehicle {
    fun accelerate()

    fun stop() {
        println("Stop")
    }
}

class LightSpace : SpaceVehicle {
    override fun accelerate() {
        println("Accelerate")
    }

//    kalau di override tetap bisa
//    override fun stop() {
//        println("stop overide")
//    }

}

fun main() {

}