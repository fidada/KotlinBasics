package com.bilqismufida.kotlinbasics

fun main(){

    //soal 1
    val rambu = "Hijau"

    if(rambu == "Merah"){
        println("Dimohon untuk berhenti berkendara")
    }else if(rambu == "Kuning"){
        println("Dimohon untuk berhati - hati dalam berkendara")
    }else if(rambu == "Hijau"){
        println("Silahkan teruskan perjalanan")
    }


    val nilai = 65

    if(nilai >= 90){
        println("Selamat Anda Lulus")
    }else if (nilai <= 70){
        println("Maaf Anda Tidak Lulus")
    }


    val emosi = false

    if (emosi){
        println("anda marah")
    }else{
        println("anda senang")
    }



    //soal 2
    val alatTulis = 3
    when(alatTulis){
        1 -> println("Pensil")
        2 -> println("Penghapus")
        3 -> println("Penggaris")
        4 -> println("Rautan")
        5 -> println("Buku")
        else -> println("BELI WOI")
    }


    val hp = "REALME 5 Pro"
    when(hp){
        "IPHONE 11" -> println("Iphone 11 Speknya = ROM : 64/128/256GB, Ukuran : 75,5 x 150,9mm, Ukuran Layar : 6.5, Kamera : Depan/12mp Belakang/12mp")
        "XIAOMI REDMI NOTE 7" -> println("Redmi Note 7 Speknya = ROM : 32/64/128GB, Ukuran : 159.2 x 75.2mm, Ukuran Layar : 6,3 inci layar IPS LCD, Kamera : Depan/13mp Belakang/48  ")
        "REALME 5 Pro" -> println("Relame 5 Pro Speknya = ROM : 64/128GB, Ukuran : 157 x 74.2mm, Ukuran Layar : 6.3 inches, Kamera : Depan/16mp Belakang/48mp")
    }


    val uang = 50
    when(uang){
        in 5..10 -> println("Aku akan jajan piscok Mamah Afdan.")
        in 20..50 -> println("Aku akan jajan Chatime")
        in 70..100 -> println("Aku akan jajan Merchandise")
        else -> println("SEDIHNYA HATIKU, TAK PUNYA DUIT")
    }


    val x : Any = true
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        is Boolean -> println("$x is a Boolean")
        else -> println("$x is BUKAN APA APA")
    }

}