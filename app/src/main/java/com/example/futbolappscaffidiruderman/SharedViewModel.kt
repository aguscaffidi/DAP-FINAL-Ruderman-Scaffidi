package com.example.futbolappscaffidiruderman

import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    var ListaUsuarios: MutableList<usuarios> = mutableListOf()
    var clubesList= listOf<Futbol>()
    lateinit var itemSelected: Futbol
}