package com.bilqismufida.kotlinbasics

fun main(){

    //tipe data angka

    // tipe data byte = 8 bit = 2 angka
    val myByte : Byte = 13

    //Tipe data Short = 16 bit = 5 angka
    val myShort : Short = 12345

    // Int / Integer = 32 bit = 10 angka
    val myInt : Int = 12345_12345

    // tipe data Long = 64 bit = 19 angka
    val myLong : Long = 12345_67890_12345_6789



    // tipe data angka titik

    //Tipe data Float = 32 bit
    val myFloat = 12.342F

    //Tipe data double = 64 bit
    val myDouble : Double = 8.282987823829

    /*
    Ada 2 cara membuat tipe data
    1. Tipe Inferemce (simple)
    2. Menetapkan tipe data nya
     */

    // Tipe data Boolean, Char, dan String

    // Tipe data boolean
    var isSunny = true
    isSunny = false

    //Tipe Char
    val letterChar = 'H'
    val digitChar = '1'
    val  signChar  = '&'

    //Tipe data string
    val myString  = "Hello Bilqis"


    //String
    val myString2 = "Hello Meisyell"

    //String
    val myString3 = "Hello Meisyell"
    val firstCharIntString  = myString3[0]
    val  lastCharIntString =  myString3[myString3.length -  1]
    println("First Character "+ firstCharIntString)

    println("Last Chracter " + lastCharIntString)















}