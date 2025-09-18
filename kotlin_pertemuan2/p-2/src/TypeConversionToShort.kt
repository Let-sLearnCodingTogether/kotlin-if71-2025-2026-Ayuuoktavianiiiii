fun main() {
    val myInt: Int = 30000
    val myShort: Short = myInt.toShort()

    println(myShort)

    val myInt2: Int = 40000
    val myShort2: Short = myInt2.toShort()

    println(myShort2)
    println(Integer.toBinaryString(myInt2).padStart(length = 32, padChar = '0'))

    //biner dari 40_000 = 100111000100000 (rentang 16 digit)
    //karena awalan 1 maka hasil akhir pasti negatif
    //lakukan invert biner
    //01100011 101111111
    // convert ke desimal
    // 25535 hasil conversi ke desimal
    // karena rumus comlement harus ditambahkan 1 pada hasil convert desimal dari bilangan binert
    // 25536 adalah bilangan desimal
    // karena biner awal dimulai dari 1 maka hasil convert adalah negatif '
    // jadi hasil convert int (32bit) menjadi (16bit) adalah -25536



}