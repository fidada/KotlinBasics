package com.bilqismufida.kotlinbasics

fun main(){
    /*
    Break & Continue
    Adalah kata kunci yg bisa digunkan dalam sebuah perulangan di Kotlin

    Break digunakan utk menghentikan seluruh perulangan

    Continue digunakan utk menghentikan perulangan yg berjalan, dan lgsg melanjutkan ke perulangan berikutnya
     */

    //contoh code break

    var i = 0
    while (true){
        println("Helo ke $i")
        i++

        if (i > 100){
            break
        }
    }

    //contoh kode continue

    for (i in 1..1000){
        if (i % 2 == 0){
            continue
        }
        println("Angka $i")
    }
}