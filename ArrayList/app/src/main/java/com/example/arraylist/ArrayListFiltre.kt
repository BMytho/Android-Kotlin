package com.example.arraylist

fun main(){

    val o1 = Ögrenci(1,"Buğra","11F")
    val o2 = Ögrenci(2,"Rabia","10A")
    val o3 = Ögrenci(3,"Mithat","12A")
    val o4 = Ögrenci(4,"Beyza","9B")
    val o5 = Ögrenci(5,"Merve","11F")

    val ogrenciler =ArrayList<Ögrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    //val sonucListe = ogrenciler.filter { it.no >= 2 }
      val sonucListe = ogrenciler.filter { (it.ad).contains("a") }
        //Stringler parantez ve contains ile çalışır

    for (o in sonucListe){//ogrenciker yazarsan oğreniciler sıralanır
        println("*********")
        println("Öğrenci no : ${o.no}")
        println("Öğrenci ad : ${o.ad}")
        println("Öğrenci sinif : ${o.sinif}")
    }


}