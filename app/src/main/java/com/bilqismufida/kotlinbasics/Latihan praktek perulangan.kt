package com.bilqismufida.kotlinbasics

fun main(){

    //Soal 1
    var angka = 15
    while (angka <= 50){
        print("$angka ")
        angka++
    }
    println("\nPerulangan While Selesai")
    println("\n-------------------------")

    //Soal 2
    var angka1 = 20
    while (angka1 <= 25){
        print("$angka1 ")
        angka1++
    }
    println("\nPerulangan While Selesai")
    println("\n-------------------------")

    //Soal 3
    var nomor = 25

    while (nomor >= 10){
        print("$nomor ")
        nomor -= 2
    }

    println("\n-------------------------")

    //Soal 4
    for (nomor2 in 100 downTo 50 step 2){
        print("$nomor2 ")
    }

    println("\n-------------------------")

    //Soal 5
    for (i in 5 until 20){
        print("$i ")
    }

    println("\n-------------------------")

    //Soal 6
    var banyakRasa = listOf("Coklat", "Stroberi", "Vanilla", "Mangga", "Pandan")
    for (rasa in banyakRasa){
        print("$rasa ")
    }

}