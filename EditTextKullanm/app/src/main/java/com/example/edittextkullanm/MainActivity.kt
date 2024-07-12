package com.example.edittextkullanm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.edittextkullanm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val alinanVeri = binding.editText.text.toString()

            binding.textView.text = alinanVeri
        }



        }

    }
