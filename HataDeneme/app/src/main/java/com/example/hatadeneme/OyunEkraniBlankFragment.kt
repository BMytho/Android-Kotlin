package com.example.hatadeneme

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.hatadeneme.databinding.FragmentOyunEkraniBlankBinding


class OyunEkraniBlankFragment : Fragment() {
    private lateinit var tasarim:FragmentOyunEkraniBlankBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani_blank, container, false)
        tasarim = FragmentOyunEkraniBlankBinding.inflate(inflater,container,false)

        val bundle:OyunEkraniBlankFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekarMi = bundle.bekarMi

        Log.e("Gelen Ad",gelenAd)
        Log.e("Gelen Yas", gelenYas.toString())
        Log.e("Gelen Boy", gelenBoy.toString())
        Log.e("Gelen BekarMi", gelenBekarMi.toString())


        tasarim.buttonBitir.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.SonucEkraninaGecis)

        }

        return tasarim.root
    }


}