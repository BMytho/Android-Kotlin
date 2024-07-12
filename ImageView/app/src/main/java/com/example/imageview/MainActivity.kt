package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonResim1.setOnClickListener{

            binding.imageView.setImageResource(R.drawable.resim1)

        }
        binding.buttonResim2.setOnClickListener{


            binding.imageView.setImageResource(resources.getIdentifier("resim2","drawble",packageName))
        }

    }
}