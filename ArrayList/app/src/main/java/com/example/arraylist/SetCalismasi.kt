package com.example.arraylist

fun main(){

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf("Bursa","İstanbul","Ankara","İzmir")

    val sayilar = HashSet<Int>()//aynı veriyi kayıt etmez

    sayilar.add(30)
    sayilar.add(10)
    sayilar.add(40)

    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())

    println(sayilar.isEmpty())

    println(sayilar.contains(20))

    for (s in sayilar){
        println(s)
    }

    for((i,s) in sayilar.withIndex()){
        println("$i. -> $s")
    }
    sayilar.remove(10)
    println(sayilar.toString())
    sayilar.clear()
    println(sayilar.toString())

}