package com.example.floatinglabel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.Toast
import com.example.floatinglabel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener{
            val ad = binding.editTextAd.text.toString().trim()
            val tel = binding.editTextTel.text.toString().trim()

            if(TextUtils.isEmpty(ad)){
                Toast.makeText(applicationContext,"Lütfen İsim Giriniz",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(tel)){
                Toast.makeText(applicationContext,"Lütfen Numara Giriniz",Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }

            if (tel.length < 10){
                Toast.makeText(applicationContext,"Lütfen geçerli bir numara giriniz ve basına sıfır eklemeyiniz",Toast.LENGTH_LONG).show()


            }
            if (tel.length > 12){
                Toast.makeText(applicationContext,"Lütfen geçerli bir numara giriniz ve basına sıfır eklemeyiniz",Toast.LENGTH_LONG).show()


            }


            Toast.makeText(applicationContext,"$ad - $tel",Toast.LENGTH_SHORT).show()

        }


    }
}