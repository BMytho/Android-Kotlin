package com.example.hatadeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SonucEkraniFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tasarim =inflater.inflate(R.layout.fragment_sonuc_ekrani, container, false)
        return tasarim
    }


}