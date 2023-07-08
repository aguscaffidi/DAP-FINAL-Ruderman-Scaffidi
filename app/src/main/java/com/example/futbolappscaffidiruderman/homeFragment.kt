package com.example.futbolappscaffidiruderman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.futbolappscaffidiruderman.adapter.futbolAdapter

class homeFragment : Fragment() {
       //private lateinit var v: View

    private lateinit var v:View
    val SharedViewModel : SharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = homeFragment()

    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,

    ): View? {

        v = inflater.inflate(R.layout.fragment_home, container, false)

        initRecyclerView()

        return v
    }
    private fun initRecyclerView(){

        val recyclerView = v.findViewById<RecyclerView>(R.id.recyclerFutbol)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = futbolAdapter(futbolProvider.clubesList)


    }

    private fun LinearLayoutManager(homeFragment: Fragment): LinearLayoutManager {
        return LinearLayoutManager(this)
    }


}

