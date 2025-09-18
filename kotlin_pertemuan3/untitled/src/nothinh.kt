//tipe data khusus yang tidak memiliki nilai sama sekali
// contoh : exeption dan loop tidak terbatas
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    //program akan berhenti di sini dengan error
    fail("terjadi kesalahan fatal!")
}