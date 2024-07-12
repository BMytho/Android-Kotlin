package com.example.rvkullanimiproje

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class FormalarAdapter(private val mContext: Context,private val formalarListesi:List<Formalar>)
    : RecyclerView.Adapter<FormalarAdapter.CardTasarimNesneleriniTutucu>() {

    inner class CardTasarimNesneleriniTutucu(view: View):RecyclerView.ViewHolder(view){

        var imageViewFormaResim:ImageView
        var textViewFormaBaslik:TextView
        var textViewFormaFiyat:TextView
        var buttonSepeteEkle:Button

        init {
            imageViewFormaResim = view.findViewById(R.id.imageViewForma)
            textViewFormaBaslik = view.findViewById(R.id.textViewFormaBaslik)
            textViewFormaFiyat = view.findViewById(R.id.textViewFormaFiyat)
            buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_forma_tasarim,parent,false)

        return CardTasarimNesneleriniTutucu(tasarim)

    }

    override fun getItemCount(): Int {

        return formalarListesi.size

    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {

        val forma = formalarListesi[position]

        holder.textViewFormaBaslik.text = forma.forma_adi
        holder.textViewFormaFiyat.text = "${forma.forma_fiyat} TL "

        holder.imageViewFormaResim.setImageResource(mContext.resources.getIdentifier(forma.forma_resim_ad,"drawable",mContext.packageName))

        holder.buttonSepeteEkle.setOnClickListener{

            Toast.makeText(mContext,"${forma.forma_adi} sepete eklendi ",Toast.LENGTH_SHORT).show()
        }

    }


}