package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import com.example.popupmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.buttonMenuAc.setOnClickListener{

            val popup =androidx.appcompat.widget.PopupMenu(this@MainActivity,binding.buttonMenuAc)

            popup.menuInflater.inflate(R.menu.pop_up_menu,popup.menu)

            popup.setOnMenuItemClickListener {item ->

                when(item.itemId){
                    R.id.action_sil-> {
                        Toast.makeText(applicationContext,"Sil Seçildi",Toast.LENGTH_SHORT).show()
                        true

                    }
                    R.id.action_düzenle->{
                        Toast.makeText(applicationContext,"Düzenle Seçildi",Toast.LENGTH_SHORT).show()
                        true


                    }
                    else  -> false
                }
            }

            popup.show()
        }
    }
}