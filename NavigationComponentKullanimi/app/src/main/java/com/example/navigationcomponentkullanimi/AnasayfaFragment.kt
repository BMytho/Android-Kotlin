package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
        private lateinit var tasarim : FragmentAnasayfaBinding
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            //val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

            tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

            tasarim.buttonBasla.setOnClickListener{
                val gecis = AnasayfaFragmentDirections.OyunEkraninaGecis("Ahmet",18, 1.7F,true)
                Navigation.findNavController(it).navigate(gecis)
            }


            return tasarim.root
        }

    }
