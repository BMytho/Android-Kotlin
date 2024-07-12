package com.example.kaltm

fun main(){

    val Öğretmen:Personel = Öğretmen()
    val İsci:Personel = İsci()

    val mudur = Mudur()

    mudur.iseAl(Öğretmen)
    mudur.iseAl(İsci)

    mudur.TerfiEttir(Öğretmen)

}