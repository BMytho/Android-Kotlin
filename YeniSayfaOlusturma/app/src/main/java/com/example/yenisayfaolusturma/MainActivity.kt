package com.example.yenisayfaolusturma
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yenisayfaolusturma.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        binding.benimButton.setOnClickListener{
            binding.benimTextView.text = "Merhaba"
        }

    }
}