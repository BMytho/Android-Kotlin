package com.example.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasigecis.databinding.ActivityBBinding
import com.example.sayfalararasigecis.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToC.setOnClickListener{
            val yeniIntent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(yeniIntent)
        }

    }

    override fun onBackPressed() {//başlangıç ekranına döndürür

        val yeniIntent = Intent(Intent(Intent.ACTION_MAIN))

        yeniIntent.addCategory(Intent.CATEGORY_HOME)
        yeniIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        startActivity(yeniIntent)
    }
}