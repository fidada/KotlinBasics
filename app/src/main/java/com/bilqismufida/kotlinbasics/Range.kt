package com.bilqismufida.kotlinbasics

fun main(){
    //Tipe data range di kotlin

    //range nya naek
    val range = 1..100

    //range nya turun
    val range2 = 100 downTo 1
    println(range2)

    //count untk mendapatkan total data range
    println(range.count())

    //contains utk ngecek apakah ada value (nilai) tersebut pada range
    println(range.contains(50))
    println(range.contains(200))

    //First = utk mendapatkan nilai pertama range
    println(range.first)

    //Last = utk mendapatkan nilai terakhir range
    println(range.last)

    //Step = utk mendapatkan nilai tiap kenaikan (kelipatan)
    println(range.step)

    //kenaikan/kelipatan
    val rangeKelipatan = 100 downTo 1 step 2
    val kelipatanRange = 1..100 step 5
}