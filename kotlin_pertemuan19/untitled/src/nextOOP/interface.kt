package nextOOP
interface Vehicle {
    fun accelarate()
    fun stop()
}

class Motor : Vehicle {
    override fun accelarate() {
        println("accelerate")
    }

    override fun stop() {
        println("stop")
    }
}

fun main() {
    val motor1 = Motor()
    motor1.accelarate()
    motor1.stop()
}