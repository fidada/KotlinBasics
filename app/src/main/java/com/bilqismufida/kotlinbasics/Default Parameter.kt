package com.bilqismufida.kotlinbasics

fun main(){
    hello("Bilqis")
    hello("Bilqis", "Mufida")

    halo("Haura")
    halo("Haura", "Salsabila")

    halo("acha")
    halo("rizqi alisha")
}

//contoh pertama
fun hello(firstName: String,lastName : String = ""){
    println("Hello $firstName $lastName")
}

//contoh kedua (NULL)
fun halo(namaAwal : String, namaAkhir : String? = null){
    if (namaAkhir == null) {
        println("hello $namaAwal")
    }else{
        println("hello $namaAwal $namaAkhir")
    }
}