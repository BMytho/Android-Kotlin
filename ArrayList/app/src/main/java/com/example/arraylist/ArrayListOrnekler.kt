package com.example.arraylist

fun main(){

     val liste = ArrayList<String>()

     val liste2 = ArrayList<Int>()
    //val liste2 : ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Kivi")

    println(meyveler.toString())
    val str = meyveler.get(1)
    println(str)

    meyveler.add("Mandalina")
    println(meyveler.toString())

    meyveler[1]="Ananas"
    println(meyveler.toString())

    meyveler.add(3,"Portokal")
    println(meyveler.toString())





}