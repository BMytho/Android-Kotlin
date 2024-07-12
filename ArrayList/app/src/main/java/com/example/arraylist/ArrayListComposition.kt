package com.example.arraylist

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()

    for (i in 1..5){

        println("$i . Persenol ad : ")
        val isim = girdi.next()

        println("$i. Personel adres il :  ")
        val il = girdi.next()

        println("$i. Personel adrec ilçe:   ")
        var ilce = girdi.next()

        val adres = Adres(il,ilce)

        val personel = Personel(i,isim,adres)

        personeller.add(personel)

    }

    for (p in personeller){
        println("********")
        println("Personel no : ${p.no}")
        println("Personel ad : ${p.isim}")
        println("Personel adres il : ${p.adres.il}")
        println("Personel ilçe : ${p.adres.ilce}")
    }
}