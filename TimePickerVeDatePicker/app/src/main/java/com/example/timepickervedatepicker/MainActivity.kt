package com.example.timepickervedatepicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timepickervedatepicker.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.editTextSaat.setOnClickListener{

            val calendar = Calendar.getInstance()
            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

                binding.editTextSaat.setText("$hourOfDay : $minute")

            },saat,dakika,true)
            timePicker.setTitle("Saat Seçiniz")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",timePicker)


            timePicker.show()



        }

        binding.editTextTarih.setOnClickListener{

            val calendar = Calendar.getInstance()

            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gun = calendar.get(Calendar.DATE)

            val datePicker = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener { view, y, a, g ->

                binding.editTextTarih.setText("$g/${a+1}/$y")

            },yil,ay,gun)

            datePicker.setTitle("Tarih Seçiniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",datePicker)

            datePicker.show()


        }
    }
}