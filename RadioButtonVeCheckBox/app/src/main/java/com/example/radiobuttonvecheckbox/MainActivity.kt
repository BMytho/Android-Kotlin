package com.example.radiobuttonvecheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.radiobuttonvecheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val javaDurum = binding.checkBoxJava.isChecked
            val kotlinDurum = binding.checkBoxKotlin.isChecked
            val gsDurum = binding.radioButtonGalatasaray.isChecked
            val fbDurum = binding.radioButtonFenerbahce.isChecked


            Log.e("java Durum ",javaDurum.toString())
            Log.e("Kotlin Durum ",kotlinDurum.toString())

            Log.e("GS Durum ",gsDurum.toString())
            Log.e("FB Durum ",fbDurum.toString())

        }

        binding.radioButtonGalatasaray.setOnCheckedChangeListener{ buttonView, isChecked ->

            if(isChecked){
                Toast.makeText(applicationContext,"Tebrikler Son Şampiyon Sizsiniz :) ",Toast.LENGTH_SHORT).show()
            }



        }
    }
}



