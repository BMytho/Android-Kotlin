package com.example.arraylist

import kotlin.random.Random

fun main(){

    val sayilar = ArrayList<Int>()

    for(i in 1..50){
        val rastgeleSayi = Random.nextInt(0,101)
        sayilar.add(rastgeleSayi)
    }

    //sayilar.sort()

    for (s in sayilar){
        println("$s")
    }
}