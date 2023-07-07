package com.example.futbolappscaffidiruderman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView

class homeFragment : Fragment() {
        lateinit var v: View
        val SharedViewModel : SharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = homeFragment()

    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        v = inflater.inflate(R.layout.fragment_home, container, false)

        fun initRRecyclerView(){

        }



        return v
    }

  }

