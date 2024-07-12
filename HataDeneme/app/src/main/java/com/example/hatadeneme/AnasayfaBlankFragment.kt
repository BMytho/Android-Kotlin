package com.example.hatadeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hatadeneme.databinding.FragmentAnasayfaBlank2Binding


class AnasayfaBlankFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBlank2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val tasarim = inflater.inflate(R.layout.fragment_anasayfa_blank2, container, false)

        tasarim = FragmentAnasayfaBlank2Binding.inflate(inflater, container, false)
        tasarim.buttonBasla.setOnClickListener{
            val gecis = AnasayfaBlankFragmentDirections.OyunEkraninaGecis("Buğra",22, 1.7F,false)
            Navigation.findNavController(it).navigate(gecis)

        }


        return tasarim.root
    }
}

