package com.example.sayfalararasveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasveritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)


        binding.buttonGNder.setOnClickListener{

            val kisi =Kisiler(123,"Bugra",1.70)
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)

            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",23)
            yeniIntent.putExtra("boy",1.70)
            yeniIntent.putExtra("nesne",kisi)

            startActivity(yeniIntent)
        }
    }
}