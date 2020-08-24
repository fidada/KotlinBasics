package com.bilqismufida.kotlinbasics

fun main(){
    myFunction()
    myFunction()
    myFunction()

    println(addUp(5,3))
    println(avg(3.2,5.3))
}

//contoh 1
fun myFunction(){
    //Di dalam () : Menaruh parameter
    //Di dalam {} : Menambah kode yg dijalankan saat fungsi dipanggil
    println("Panggil dr fungsi")
}

//contoh 2 (Int)
fun addUp(a : Int, b : Int):Int{
    //output
    return a+b
}

//contoh 3 (double)
fun avg(a : Double, b : Double) : Double{
    return (a+b)/2
}

/*
Inti dr fungsi. Yaitu memiliki kelebihan :
1. Bisa menggunakan kembali kode

2. Contohnya, jika kita bekerja dgn partner, kita mengurus 1 bagian kode, dan dia mengurus 1 bagian kode lain.
   Kita dpt menggabungkan kodenya dgn memiliki fungsi/function yg dpt kita gunakan kembali.

3. Kamu dpt menggunakan fungsi yg sudah dibuat sebelumnya, dan kamu bisa menggunakan/memanggil fungsinya saja.

4.
 */