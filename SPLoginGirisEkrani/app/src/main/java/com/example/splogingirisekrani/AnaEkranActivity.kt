package com.example.splogingirisekrani

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.splogingirisekrani.databinding.ActivityAnaEkranBinding

class AnaEkranActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnaEkranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAnaEkranBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE)

        val ka = sp.getString("KullanıcıAdi","kullanıcı adı yok")
        val s = sp.getString("sifre","Sifre yok")

        binding.textViewCikti.text = "Kullanici adi : $ka Şifre : $s"


        binding.buttonCKSYap.setOnClickListener{

            val editor = sp.edit()
            editor.remove("kullanici adi")
            editor.remove("sifre")
            editor.commit()



            startActivity(Intent(this@AnaEkranActivity,MainActivity ::class.java))
            finish()


        }

    }
}