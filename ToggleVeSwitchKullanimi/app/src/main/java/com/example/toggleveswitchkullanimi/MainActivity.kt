package com.example.toggleveswitchkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.toggleveswitchkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->

            //switch ve toggle görsel oalrak farklı ancak çalışma yapısı aynı switch yerine toogle yazarsanda çalışır
            if (isChecked) {
                Log.e("Switch", "ON")

            } else {
                Log.e("Switch", "Off")

            }


        }


        binding.toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->

            //switch ve toggle görsel oalrak farklı ancak çalışma yapısı aynı switch yerine toogle yazarsanda çalışır
            if (isChecked) {
                Log.e("ToggleButton", "ON")

            } else {
                Log.e("ToggleButton", "Off")

            }
        }

        binding.button.setOnClickListener{
            val switchDurum = binding.switch1.isChecked
            val toggleDurum = binding.toggleButton.isChecked

            Log.e("Switch Durum", switchDurum.toString())
            Log.e("Toggle Durum0",toggleDurum.toString() )
        }
    }
}