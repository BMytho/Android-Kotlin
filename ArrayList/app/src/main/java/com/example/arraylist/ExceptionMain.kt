package com.example.arraylist

fun main(){

    val x = 10
    val y = 0

    println("Sounc : ${x/y}")

    try{
        println("Sonuc : ${x/y}")
        println("Bölüm yapıldı")

    }catch (e:Exception) {


        println("İkinci sayi sıfıra bölğnemez")
    }

}