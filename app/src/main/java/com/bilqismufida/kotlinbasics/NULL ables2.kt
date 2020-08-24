package com.bilqismufida.kotlinbasics

fun main(){
    //OPERATOR ELVIS = ?
    var nameNullable : String? = "Bilqis"
    nameNullable = null

    val nama = nameNullable ?: "Dina"
    println("Name is $nama")

    //Jika nameNullable kosong, maka harus diganti dgn nama


    //NOT NULL ASSERTION = !!
    //fungsinya mengubah tipe nullable ke tipe non-nullable,
    // dan membuat error "null pointer exception" jika tipe nullable tdk memiliki nilai

    println(nameNullable!!.toLowerCase())
}