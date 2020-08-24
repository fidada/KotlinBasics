package com.bilqismufida.kotlinbasics

fun main(){
    //NULL Artinya kosong
    //NULL adalah error yg sering programmer dpt
    //yaitu "NULL Pointer Exception"
    //NULL disebut jg "The Billion Dollar Mistake"

    var name : String = "Bilqis"
    //name = null -> Compilation Error

    var nullableName : String? = "Bilqis"
    //nullableName = null

    var len1 = name.length

    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())
    //toLowerCase = semua dijadikan huruf kecil

    nullableName?.let { println(it.length) }
}