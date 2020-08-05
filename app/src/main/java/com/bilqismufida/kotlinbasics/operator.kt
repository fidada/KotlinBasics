package com.bilqismufida.kotlinbasics

fun main(){
    /*
    OPRATOR ARITMATIKA
    1. Pertambahan +
    2. Pengurangan -
    3. Perkalian   *
    4. Pembagian   /
    5. Modulus (sisa hasil bagi) %
     */

    //contoh 1
    val hasilPertambahan = 5 + 3
    println(hasilPertambahan)

    //contoh 2
    val hasilPengurangan = 5 - 3
    println(hasilPengurangan)

    //contoh 3
    val hasilPerkalian = 5 * 3
    println(hasilPerkalian)

    //contoh 4
    var hasilPerkalian2 = 5
    hasilPerkalian2 *= 2
    println(hasilPerkalian2)

    //contoh 5
    val hasilPembagian = 15 / 3
    println(hasilPembagian)

    //contoh 6
    val hasilModulus = 15 % 2
    println(hasilModulus)

    val a = 20
    val b = 4
    val hasilPembagian2 = a / b
    println(hasilPembagian2)

    val c = 5.0
    val d = 3
    val hasil : Double
    hasil = c / d
    println(hasil)


    /*
     OPERATOR PEMANDING
     1. == sama dengan
     2. != Tidak sama dgn
     3. <  Lebih kecil
     4. >  Lebih besar
     5. <= Kurang dari sama dgn
     6. >= Lebih dr sama dgn
     */

    //contoh 1
    val isEqual = 5 == 3 // kalo 5 == 5 true / benar
    println("isEsqual is $isEqual")

    //contoh 2
    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")

    //STRING INTERPOLATION
    println("is 5 greater 3 ${5 > 3}") //true

    println("is -5 greater 3 ${-5 > 3}") //false

    println("is 5 lower equal 3 ${5 <= 3}") //false

    println("is 5 greater equal 3 ${5 >= 3}") //true

    println("is 5 greater equal 5 ${5 >= 5}") //true karena menerima nilai yg lebih / sama


    /*
    PENUGASAN, PENINGKATAN, DAN PENURUNAN OPERATOR
     */

    //PENUGASAN OPERATOR
    // +=, -=, *=, /=, %=

    var myNumber = 5
    myNumber *= 4
    myNumber += 3
    println("myNumber is ${myNumber}")
    // 5 * 4 = 20 + 3 = 23

    //PENINGKATAN OPERATOR
    // ++ = menambah 1 angka
    println("myNumber is ${++myNumber}")

    //PENURUNAN OPERATOR
    //-- = mengurangi 1 angka
    println("myNumber is ${--myNumber}")

}