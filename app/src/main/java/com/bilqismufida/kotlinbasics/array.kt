package com.bilqismufida.kotlinbasics

fun main(){
    //hawah\\
    /*
    Array sering digunakan untuk menyimpan data yg memiliki tipe data yg sama

    Contoh nya, digunakan untuk menyimpan produk2 apa saja yg dibeli oleh pelanggan dalam sebuah sistem kasir
     */

    //menggunakan function arrayOf
    val produkygdibeli = arrayOf("Susu Ultra", "Sari Roti", "Selai Nutella")
    println(produkygdibeli[2])

    /*
    Kita membuat variable (penampung terlibih dahulu), lalu variable tersebut diisi dgn memanggil funtion arrayOf().
    Argumen yg diisi di dalam function arrayOf adlh data yg ingin kita simpan di dalam array.
    */

    //arrayOf sendiri merupakan sebuah function yg dmn kita bisa menyimpan berbagai macam tipe data yg berbeda2 di dalam 1 array
    val detailProduct = arrayOf("Susu Ultra", 1.5, 18000)
    println(detailProduct[0])

    //Bisa jg dgn contohnya membuat array khusus untuk tipe data int
    val jumlahprodukygdibeli = intArrayOf(5, 1, 2)
    println(jumlahprodukygdibeli[2])

    //function array bisa untuk = int, bool, char, float, double

    //contoh lain
    val names = arrayOf("Acha", "Bilqis", "Dina", "Meisyell", "Haura")
    names[4] = "Firyal"
    println(names[4])

    val nilai = intArrayOf(10, 8, 9, 5)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
    println(nilai[3])

    //array boleh null(kosong)
    val binatang : Array<String?> = arrayOfNulls(5)
    binatang[0] = "Amjink"
    binatang[1] = "Nyemod"
    binatang[2] = "Ibab"
    binatang[3] = null
    binatang[4] = "Bu Aya"
    println(binatang[0])
}