package com.example.arraylist

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("Ahmet")
    isimler.add("Defne")
    isimler.add("Rabia")
    isimler.add("Buğra")
    isimler.add("Mehmet")

    println("Aratmak için isim giriniz")
    val isim = girdi.next()

    for (i in isimler){
        if (i == isim) {
            println("İSİM MEVCUT")
            break
        }

    }


}