package com.example.arraylist

fun main(){

    val str1 = "Merhaba"

    println(str1.subSequence(0,3)) // 0. indeksten 2 ye kadar yazdırır sağdakinin bir eksiği

    val str2 = "Merhaba"

    if (str2.contains("er"))
        println("İçeriyor")

    val str3 ="Merhaba"

    println(str3.toUpperCase())
    println(str3.toLowerCase())

    val str4 = "Merhaba Nasılsın"

    val dizi = str4.split(" ")

    for (d in dizi){
        println(d)
    }

    val str5 = " Merhaba "
    println(str5.trim())//Boşlukları giderir
}