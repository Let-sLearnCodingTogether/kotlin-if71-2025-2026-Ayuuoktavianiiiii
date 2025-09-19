    fun main() {
        val finalExam = 'A'

        when(finalExam){
            'A' -> println("Lulus")
            'B' -> println("Lulus juga")
            'C' -> println("Ya bisa lulus")
            else -> println("Tidak lulus")
        }


    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println(" Ya bisa Lulus")
        else -> println("Tidak lulus")

    }
}