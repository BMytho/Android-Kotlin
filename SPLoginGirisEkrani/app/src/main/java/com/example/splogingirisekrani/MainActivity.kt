package com.example.splogingirisekrani

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.splogingirisekrani.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding =ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisBilgi",Context.MODE_PRIVATE)

        val ogka = sp.getString("kullaniciAdi","Kullanıcı adı Yok")
        val ogs = sp.getString("Sifre","Sifre yok")

        if (ogka == "admin" && ogs == "123"){

            startActivity(Intent(this@MainActivity,AnaEkranActivity ::class.java))
            finish()

        }


        binding.buttonGiris.setOnClickListener{

            val ka = binding.editTextKullaniciAdi.text.toString()
            val s = binding.editTextSifre.text.toString()

            if (ka == "admin" && s == "123456"){
                val editor = sp.edit()
                editor.putString("kullaniciAdi",ka)
                editor.putString("Sifre",s)
                editor.commit()




                startActivity(Intent(this@MainActivity,AnaEkranActivity ::class.java))
                finish()

            }else{
                Toast.makeText(applicationContext,"Hatalı giriş",Toast.LENGTH_SHORT).show()
            }


        }
    }
}