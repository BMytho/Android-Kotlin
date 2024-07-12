package com.example.sayitahmini

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sayitahmini.databinding.ActivityTahminBinding
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminBinding

    private var rastgeleSayi = 0
    private var sayac = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTahminBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setContentView(R.layout.activity_tahmin)

        rastgeleSayi = Random.nextInt(101)

        Log.e("Rastgele Sayi",rastgeleSayi.toString())


        binding.buttonTahmin.setOnClickListener{

            //val intent = Intent(this@TahminActivity,SonucActivity::class.java)
            //finish()
            //startActivity(intent)

            sayac = sayac - 1

            val tahmin = binding.editTextGirdi.text.toString().toInt()

            if (tahmin == rastgeleSayi){

                val intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)
                return@setOnClickListener

            }
            if (tahmin > rastgeleSayi ){

                binding.textViewYardim.text = "Azalt"
                binding.textViewKalanHak.text = "KALAN HAK : $sayac"

            }
            if (tahmin < rastgeleSayi){

                binding.textViewYardim.text = "Arttır"
                binding.textViewKalanHak.text = "KALAN HAK : $sayac"

            }

            if (sayac == 0 ){

                val intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)

            }

            binding.editTextGirdi.setText("")

        }
    }
}