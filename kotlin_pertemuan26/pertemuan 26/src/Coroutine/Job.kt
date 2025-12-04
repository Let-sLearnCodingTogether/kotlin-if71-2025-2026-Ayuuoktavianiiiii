package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Aplikasi job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif? ${job.isActive}")
    println("Apakah job ini dibatalkan? ${job.isCancelled}")

    job.cancel()
    job.join() // akan menunggu sampai dengan job selesai

    println("aplikasi sedang digunakan")
}

suspend fun updateVersion1() {
    delay(5_000)
    println("UpdateSelesai")
}