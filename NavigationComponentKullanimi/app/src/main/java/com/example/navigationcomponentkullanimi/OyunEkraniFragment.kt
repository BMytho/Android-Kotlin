package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {

    private lateinit var tasarim : FragmentOyunEkraniBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)
        tasarim = FragmentOyunEkraniBinding.inflate(inflater,container,false)

        val bundle:OyunEkraniFragmentArgs by navArgs()

        val gelenAd = bundle.Ad
        val gelenYas = bundle.Yas
        val gelenBoy = bundle.Boy
        val gelenBekarMi = bundle.BekarMi

        Log.e("Gelen Ad",gelenAd)
        Log.e("Gelen Yas",gelenYas.toString())
        Log.e("Gelen Boy",gelenBoy.toString())
        Log.e("Bekar Mi",gelenBekarMi.toString())


        tasarim.buttonBitir.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.SonucEkraninaGecis)
        }

        return tasarim.root
    }

}

