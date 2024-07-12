package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.videoview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)


        binding.buttonBasla.setOnClickListener{
            val adres = Uri.parse("android.resource://"+packageName+"/"+R.raw.video)

            binding.videoView.setVideoURI(adres)
            binding.videoView.start()

        }

        binding.buttonDur.setOnClickListener{

            binding.videoView.stopPlayback()

        }
    }
}