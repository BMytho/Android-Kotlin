package com.example.sayfalararasigecis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val yeniIntent = Intent(this@ActivityC,MainActivity::class.java)

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)//backstackleri siler ve kısır döngü yapmaz
        startActivity(yeniIntent)
    }
}