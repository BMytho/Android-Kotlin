package com.example.arraylist

import java.util.Scanner

fun main(){

    var girdi = Scanner(System.`in`)

    val dersNotlariListesi = ArrayList<DersNotlar>()


    while (true){

        println("Dersin adını giriniz")
        val ders = girdi.next()

        println("Dersin Notunu Giriniz")
        val not = girdi.nextInt()


        val yeniNot = DersNotlar(ders, not)

        dersNotlariListesi.add(yeniNot)




        println("Çıkmak için (1),Devam etmek için Diğer Sayilar")
        val cikis = girdi.nextInt()

        if (cikis==1){
            println("**********************")

            var toplam = 0
                for (dn in dersNotlariListesi){
                    println("${dn.ders},${dn.not}")
                    toplam = toplam + dn.not
                }

            val ortlama = toplam / dersNotlariListesi.size

            println("ORTALAMA : $ortlama")

            if (ortlama >= 50){
                println("Tebrikler Geçtiniz")
            }
            else
                println("KALDINIZ")


            println("Çıkış Yapıldı")
            break
        }
    }
}