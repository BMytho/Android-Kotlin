package com.example.kaltm

class Mudur:Personel() {
    fun iseAl(p:Personel){
        p.iseAlindi()


    }

    fun TerfiEttir(p:Personel){
        (p as Öğretmen).maasArttir()

    }
}