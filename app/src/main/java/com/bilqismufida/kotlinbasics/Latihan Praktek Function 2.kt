package com.bilqismufida.kotlinbasics

fun main(){

    //No.1
    val nilaiUjianTulis = 95
    val nilaiUjianPraktek = 87
    val nilaiUjianTeori = 80

    val apakahLulusUjianTulis = nilaiUjianTulis > 75
    val apakahLulusUjianPraktek = nilaiUjianPraktek > 75
    val apakahLulusUjianTeori = nilaiUjianTeori > 75

    val apakahLulusUjian = apakahLulusUjianTulis && apakahLulusUjianTeori && apakahLulusUjianPraktek
    println(apakahLulusUjian)


    //no. 2
    val uangAdi = 10
    val uangBella = 50
    val uangCeri = 20

    val hargaYangInginAdiBeli = uangAdi > 15
    val hargaYangInginBellaBeli = uangBella > 35
    val hargaYangInginCeriBeli = uangCeri > 10

    val apakahBisaDiBeli = hargaYangInginAdiBeli || hargaYangInginBellaBeli || hargaYangInginCeriBeli
    println(apakahBisaDiBeli)

    //no. 3
    println(" No. 3")
    println(" Break & Continue\n" +
            "    Adalah kata kunci yg bisa digunkan dalam sebuah perulangan di Kotlin\n" +
            "\n" +
            "    Break digunakan utk menghentikan seluruh perulangan\n" +
            "\n" +
            "    Continue digunakan utk menghentikan perulangan yg berjalan, dan lgsg melanjutkan ke perulangan berikutnya")

    //no. 4 && 5
    akun("Adi", "Saputra")
    password("ketek", "ikan")

    akun("Bella", "Sabella")
    password("bunga")

}

//no. 4
fun akun(namaDepan: String, namaBelakang: String = ""){
    println("Akun anda : $namaDepan $namaBelakang")
}

//no. 5
fun password(pw1: String, pw2: String? = null){
    if (pw2 == null){
        println("Password anda: $pw1")
    }else{
        println("Password anda: $pw1 $pw2")
    }
}