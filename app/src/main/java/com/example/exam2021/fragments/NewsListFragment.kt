package com.example.exam2021.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2021.R
import com.example.exam2021.adapters.newsAdapter
import com.example.exam2021.models.Constants


class NewsListFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_list, container, false)

        val currentCategory = requireArguments().getInt("CATEGORY")

        val filteredArray = Constants.news.filter{ it.categoryId == currentCategory} as ArrayList

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewfragment)
        recyclerView.adapter = newsAdapter(filteredArray, requireActivity())

        return view
    }

}