package com.bilqismufida.kotlinbasics

fun main(){
    // OwO oWo OWO owo
    // Percabangan IF - ELSE

    //Contoh Ke-1
    val tinggiOrangKe1 = 170
    val tinggiOrangKe2 = 189

    //pernyataan salah
    if (tinggiOrangKe1 > tinggiOrangKe2){
        println("Tinggi orang ke 1 > Tinggi org Ke 2")
    }else if (tinggiOrangKe1 == tinggiOrangKe2){
        println("Tinggi orang ke 1 = tinggi org ke 2")
    }else{
        //else = berfungsi sebagai harapan terakhir jika pernyataa
        println("Tidak Di Ketahui Tinggi nya")
    }


    //Contoh 2


    val umur = 31

    if (umur >= 20){
        println("Kamu boleh menikah")
    }else if (umur >= 18){
        println("Kamu harus membuat KTP")
    }else if (umur >= 16){
        println("Kamu boleh mengendarai motor")
    }else{
        println("KAMU TERLALU MUDA")
    }


    //contoh 3 ( TANPA {} )
    val umur2 = 31

    if (umur2 >= 30)
        println("Kamu > umur 30")


    //Contoh ke 4 (MEMAKAI STRING)
    val nama = "Bilqis"

    if (nama == "Bilqis"){
        println("Selamat datang Bilqis")
    }else{
        println("Who Are You?")
    }


    //contoh ke 5
    val hujan = true
    if (hujan){
        println("Hari ini hujan")
    }



    //PERCABANGAN WHEN

    //Contoh 1
    val musim = 5
    when(musim){
        1 -> println("Musim Semi")
        2 -> println("Musim Panas")
        3 -> {
            println("Musim Gugur / Fall")
            println("Musim Gugur / Autumm")
        }
        4 -> println("Musim Dingin")
        else -> println("Musim tdk Valid")
    }

    //Contoh 2
    val bulan = 3
    when(bulan){
        in 3..5 -> println("Musim Semi")
        in 6..8 -> println("Musim Panas")
        in 9..11 -> println("Musim Gugur")
        in 12 downTo 1 -> println("Musim Dingin")
        12, 1, 2 -> println("Musim Dingin")
        else -> println("Musim Tdk Valid")
    }

    //Contoh 3
    val umur3 = 21

    when(umur3){
        in 21..50 -> println("kamu boleh nikah")
        in 18..20 -> println("kamu harus buat KTP")
        16, 17 -> println("kamu boleh naik motor")
        else -> println("kamu masih bocah")
    }

    //Contoh 4
    /*berjenis objek
    berfungsi untuk value nya bisa menjadi tipe data jenis apapun
     */
    val x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else ->("$x Tdk Ada Di Atas")
    }

    val x2 : Any = 13.37f
    when(x2){
        is Int -> println("$x2 is an Int")
        !is Double -> println("$x2 is an Double")
        is String -> println("$x2 is an String")
        else ->("$x2 Tdk Ada Di Atas")
    }

}
