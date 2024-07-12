package com.example.sayitahmini

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayitahmini.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySonucBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)
        setContentView(binding.root)


        val sonuc = intent.getBooleanExtra("sonuc",false)

        if(sonuc == true){
            binding.textViewSonuc.text = "KAZANDINIZ"
            binding.imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }
        else{
            binding.textViewSonuc.text = "KAYBETTİNİZ"
            binding.imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }


        binding.buttonTekrar.setOnClickListener{

            startActivity(Intent(this@SonucActivity,TahminActivity::class.java))
            finish()
        }
    }
}