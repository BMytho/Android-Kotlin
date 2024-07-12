package com.example.finishmetodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finishmetodu.databinding.ActivityMainBinding
import com.example.finishmetodu.databinding.ActivityOyunEkraniBinding
import com.example.finishmetodu.databinding.ActivityOyunEkraniBinding.*

class ActivityOyunEkrani : AppCompatActivity() {
    private lateinit var binding: ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_oyun_ekrani)
        setContentView(binding.root)


        binding.buttonBitir.setOnClickListener{
            val intent = Intent(this@ActivityOyunEkrani,ActivitySonuc::class.java)

            finish()

            startActivity(intent)
        }

    }
}