package com.example.futbolappscaffidiruderman.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.futbolappscaffidiruderman.Futbol
import com.example.futbolappscaffidiruderman.R
import com.example.futbolappscaffidiruderman.SharedViewModel

class futbolAdapter (val futbolLista : List<Futbol>): RecyclerView.Adapter<futbolViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): futbolViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return futbolViewHolder(layoutInflater.inflate(R.layout.item_futbol, parent, false))
    }

    override fun onBindViewHolder(holder: futbolViewHolder, position: Int) {

            val item = futbolLista [position]
            holder.render(item)

    }

    override fun getItemCount(): Int = futbolLista.size

    }






