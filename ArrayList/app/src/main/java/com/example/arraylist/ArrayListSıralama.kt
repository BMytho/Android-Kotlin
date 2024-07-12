package com.example.arraylist

fun main(){

    val k1 = Kisiler(1,"Buğra")
    val k2 = Kisiler(2,"Rabia")
    val k3 = Kisiler(3,"İlknur")

    val kisiler = ArrayList<Kisiler>()

    kisiler.add(k1)
    kisiler.add(k2)
    kisiler.add(k3)

    println("öNCE")

    for (k in kisiler){
        println("${k.kisiNo} - ${k.kisiAdi}")
    }
    println("Sayisal Kücükten Büyüğe")
    val siralama = ArrayList<Kisiler>()
    kisiler.sortedWith(compareBy{it.kisiNo})

    for (k in siralama){
        println("${k.kisiNo} - ${k.kisiAdi}")
    }




}