package com.bilqismufida.kotlinbasics

fun main(){
    /*
    Boolean memiliki 3 macam operasi :
    1. && = Dan
    2. || = atau
    3. !  = Kebalikan / tdk


    - operasi && =

    true  && true  = true
    true  && false = false
    false && true  = false
    false && false = false


    - opersi || =

    true  || true  = true
    true  || false = true
    false || true  = true
    false || false = false


    - Operasi ! =

    ! true  = false
    ! false = true

     */


    //contoh 1
    val nilaiUjian = 80
    val nilaiAbsen = 60
    val nilaiExtra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)


    //contoh 2
    val nilaiUjianAqidah = 60
    val nilaiUjianFiqih  = 75
    val nilaiUjianSiroh = 70

    val apakahLulusUjianAqidah = nilaiUjianAqidah > 80
    val apakahLulusUjianFiqih  = nilaiUjianFiqih  > 80
    val apakahLulusUjianSiroh  = nilaiUjianSiroh  > 80

    val apakahLulusUjianDiniyah = apakahLulusUjianAqidah && apakahLulusUjianFiqih || apakahLulusUjianSiroh
    println(apakahLulusUjianDiniyah)

}