package com.example.progressbarsliderveratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.example.progressbarsliderveratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener{
            binding.progressBar.visibility = View.VISIBLE
        }

        binding.buttonBitir.setOnClickListener{
            binding.progressBar.visibility = View.INVISIBLE
        }

        binding.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                binding.textViewSonuc.text = "Sonuç : $progress"  //progress.toStirng

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }


        })

        binding.buttonGoster.setOnClickListener{
            val gelenIlerleme = binding.slider.progress
            val gelenOylama = binding.ratingBar.rating

            Log.e("İlerleme ",gelenIlerleme.toString())
            Log.e("Oylama ",gelenOylama.toString())

        }





    }



}