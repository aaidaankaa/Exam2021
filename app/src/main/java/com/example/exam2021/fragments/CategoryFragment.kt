package com.example.exam2021.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2021.R
import com.example.exam2021.adapters.CategoryAdapter
import com.example.exam2021.models.Constants


class CategoryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerviewfragments)
        recyclerView.adapter = CategoryAdapter(Constants.categories, requireActivity())

        return view

    }

}

