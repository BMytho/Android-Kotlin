package com.example.sayfalararasveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val gelenMesaj= intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)

        Log.e("Mesaj",gelenMesaj.toString())
        Log.e("Yas",gelenYas.toString())
        Log.e("Boy",gelenBoy.toString())

        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler

        Log.e("Kişi TCno",(gelenKisi.tcNo).toString())
        Log.e("Kişi İSİM",(gelenKisi.isim))
        Log.e("Kişi BOY",(gelenKisi.boy).toString())

    }
}