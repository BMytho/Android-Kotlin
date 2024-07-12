package com.example.arraylist

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)


    var sayac =1

    val ogrenciler = ArrayList<Ogrenci>()

    while (true){

        println("Öğrenci Adı giriniz")
        val ad = girdi.next()

        println("Öğrenci sınıfını Giriniz")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac = sayac+1

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1) - Devam etmek için sayi herhangi sayi giriniz")

        val cikis = girdi.nextInt()
        if (cikis==1){
            for (ogrenci in ogrenciler){
                println("**********")
                println("Öğrenci ad : ${ogrenci.ad}")
                println("Öğrenci no : ${ogrenci.no}")
                println("Öğrenci sinif : ${ogrenci.sinif}")
            }


            println("Çıkış Yapıldı")

            break
        }
    }
}