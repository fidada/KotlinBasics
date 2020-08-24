package com.bilqismufida.kotlinbasics

fun main(){
    //1.
    val months = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Ags", "Sep", "Oct", "Nov", "Des")
    println(months[2])

    //2.
    val nilai = intArrayOf(90, 83, 78, 88, 50)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
    println(nilai[3])
    println(nilai[4])

    //3.
    val bool = booleanArrayOf(true, false)
    println(bool[0])
    println(bool[1])

    val char = charArrayOf('a', 'b')
    println(char[0])
    println(char[1])

    val float = floatArrayOf(3.5f, 6.2f)
    println(float[0])
    println(float[1])

    val double = doubleArrayOf(2.4, 6.3)
    println(double[0])
    println(double[1])

    //4.
    val makanan : Array<String?> = arrayOfNulls(3)
    makanan[0] = "Ice Cream"
    makanan[1] = null
    makanan[2] = "Cheese"
    println(makanan[0])

    //5.
    var bapack = arrayOf("Kang Sobur", "Haji Mahmud", "Bapak Ridwan", "BGSD")
    bapack[3] = "Bang Somad"
    println(bapack[3])

    println("xixixixxixiix")
}