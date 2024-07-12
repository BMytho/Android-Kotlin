package com.example.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinnerkullanimi.databinding.ActivityMainBinding
import java.util.Objects

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val ulkeler = arrayListOf<String>()
    private lateinit var veriAdaptoru:ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        ulkeler.add("Türkiye")
        ulkeler.add("İtalya")
        ulkeler.add("Almanya")
        ulkeler.add("Çin")
        ulkeler.add("İspanya")
        ulkeler.add("Monaco")
        ulkeler.add("Portekiz")


        veriAdaptoru = ArrayAdapter(this, android.R.layout.simple_list_item_1, ulkeler)


        binding.spinner.adapter = veriAdaptoru

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long




            ) {
                Toast.makeText(applicationContext,"Seçilen Ülke : ${ulkeler[position]}",Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
        binding.buttonGoster.setOnClickListener{
            Toast.makeText(applicationContext,"Ülke : ${ulkeler[binding.spinner.selectedItemPosition]}",Toast.LENGTH_SHORT).show()
        }
    }
}