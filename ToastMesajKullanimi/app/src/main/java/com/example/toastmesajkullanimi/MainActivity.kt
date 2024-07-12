package com.example.toastmesajkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.toastmesajkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)


        binding.buttonNormal.setOnClickListener{

            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_LONG).show()
        }

        binding.buttonZel.setOnClickListener{
            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim,null)

            val textViewMesaj = tasarim.findViewById(R.id.textViewMesaj) as TextView

            textViewMesaj.text = "Merhaba Özel Mesaj"

            val toastOzel = Toast(applicationContext)

            toastOzel.view = tasarim

            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toastOzel.duration = Toast.LENGTH_LONG
            toastOzel.show()

        }
    }
}