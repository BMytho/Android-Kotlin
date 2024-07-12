package com.example.snackbarkullanim

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snackbarkullanim.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        binding.buttonNormal.setOnClickListener{view ->

            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show()

        }

        binding.buttonGeriDonus.setOnClickListener{x ->

            Snackbar.make(x,"Mesaj Silinsin mi ?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){y ->

                    Snackbar.make(y,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show()

                }
                .show()

        }
        binding.buttonOzel.setOnClickListener{z ->

            val sb = Snackbar.make(z,"İnternet Bağlantısı Yok !",Snackbar.LENGTH_LONG)

           sb.setAction("Tekrar Dene"){

           }

            sb.setActionTextColor(Color.RED)
            sb.setActionTextColor(Color.GRAY)
            sb.setBackgroundTint(Color.WHITE)



            sb.show()


        }

    }
}