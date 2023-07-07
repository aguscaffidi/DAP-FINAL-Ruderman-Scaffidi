package com.example.futbolappscaffidiruderman.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.futbolappscaffidiruderman.Futbol
import com.example.futbolappscaffidiruderman.R

class futbolViewHolder(view:View) : RecyclerView.ViewHolder (view) {

    val clubFutbol = view.findViewById<TextView>(R.id.tvFutbolEquipo)
    val ligaFutbol = view.findViewById<TextView>(R.id.tvFutbolLiga)
    val paisFutbol = view.findViewById<TextView>(R.id.tvFutbolPais)
    val fotoFutbol = view.findViewById<ImageView>(R.id.ivFutbol)

    fun render(futbolModel: Futbol){

        clubFutbol.text = futbolModel.equipo
        ligaFutbol.text = futbolModel.liga
        paisFutbol.text = futbolModel.pais

    }
}