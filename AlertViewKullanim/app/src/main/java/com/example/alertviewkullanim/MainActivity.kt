package com.example.alertviewkullanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertviewkullanim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener {

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam") { dialogInterface, i ->

                Toast.makeText(applicationContext, "Mesaja Ulaştınız", Toast.LENGTH_SHORT).show()


            }

            ad.setNegativeButton("İptal") { dialogInterface, i ->

                Toast.makeText(applicationContext, "İptal Tıklandı", Toast.LENGTH_SHORT).show()


            }

            ad.create().show()

            binding.buttonOzel.setOnClickListener {

                val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)

                val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText

                val ad = AlertDialog.Builder(this@MainActivity)

                ad.setMessage("Mesaj")
                ad.setTitle("Başlık")
                ad.setIcon(R.drawable.resim)

                ad.setView(tasarim)

                ad.setPositiveButton("Kaydet") { dialogInterface, i ->

                    val alinanVeri = editTextAlert.text.toString()

                    Toast.makeText(applicationContext, "Alınan Veri : $alinanVeri", Toast.LENGTH_SHORT).show()


                }

                ad.setNegativeButton("İptal") { dialogInterface, i ->

                    Toast.makeText(applicationContext, "İptal Tıklandı", Toast.LENGTH_SHORT).show()


                }

                ad.create().show()


            }
        }
    }
}