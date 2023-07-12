package com.example.futbolappscaffidiruderman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.futbolappscaffidiruderman.adapter.futbolAdapter

class homeFragment : Fragment() {

    private lateinit var v: View
    private lateinit var futbolListAdapter :futbolAdapter
//    val SharedViewModel: SharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = homeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        v = inflater.inflate(R.layout.fragment_home, container, false)

        initRecyclerView()

        futbolListAdapter = futbolAdapter(futbolProvider.clubesList, requireContext()){
        pos-> onItemClick(pos)
        }

        return v
    }

    private fun onItemClick(pos: Any) {
        Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_descriptionFragment)
    }

    private fun initRecyclerView() {
        val recyclerView = v.findViewById<RecyclerView>(R.id.recyclerFutbol)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = futbolAdapter(futbolProvider.clubesList, requireContext()) { pos ->
            onItemClick(pos)
        }
    }


}

