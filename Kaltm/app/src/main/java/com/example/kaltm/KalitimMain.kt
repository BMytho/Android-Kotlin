package com.example.kaltm

fun main(){

    val araba = Araba("Sedan","Siyah","6")

    println(araba.kasaTipi)
    println(araba.renk)
    println(araba.vites)

    val nissan = Nissan("2022","Kırmızı","6","Sedan")

    println(nissan.renk)
    println(nissan.kasaTipi)
    println(nissan.vites)
    println(nissan.model)

    //val hayvan:Hayvan = Kopek()
    //Hayvan.sesCıkar() Poli örnek...
}