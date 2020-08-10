package com.bilqismufida.kotlinbasics

fun main(){
    //looping (perulangan)

    //Perulangan while menjalankan kode berulang kali selama kondisi yg diberikan benar


    /* while (kondisi){
    kondisi untuk dijalankan
    }
     */

    //contoh 1
    var angka1 = 1
    while (angka1 <= 10){
        print("$angka1 ")
        angka1++
    }
    println("\nPerulangan While Selesai")

    //Contoh 2
    var a = 100

    while (a >= 0){
        print("$a ")
        a -= 5
    }
    println("\nPerulangan While Selesai")



    //Contoh ke 3
    var rasaSuhu = "Dingin"
    var suhuRuangan = 16

    while (rasaSuhu == "Dingin"){
        print("$suhuRuangan ")
        suhuRuangan++

        if (suhuRuangan == 23){
            rasaSuhu = "Nyaman"
            println("\nSekarang suhu nya nyaman")
        }
    }

    println("\n- - - - - - - - - - - - - - - - - - - - -")

    //PERULANGAN FOR
    //Perulangan for digunakan untuk menalukan array

    //Contoh 1 ( *..* )
    for (number in 1..10){
        print("$number ")
    }


    println("\n- - - - - - - - - - - - - - - - - - - - -")

    //Contoh 2 (* until *)
    for (i in 1 until 10){
        print("$i ")
    }

    println("\n- - - - - - - - - - - - - - - - - - - - -")

    //Contoh 3 (* downTo *)
    for (a in 10 downTo 1){
        print("$a ")
    }

    println("\n- - - - - - - - - - - - - - - - - - - - -")

    //Contoh 4 (* downTo  *  step *)
    for (b in 10 downTo  1 step 2){
        print("$b ")
    }

    println("\n- - - - - - - - - - - - - - - - - - - - -")

    //Contoh 5
    val banyakKota = listOf("Jakarta", "Surabaya", "Bandung", "Malang", "Jogja")
    for (kota in banyakKota) {
        print("$kota ")
    }
}