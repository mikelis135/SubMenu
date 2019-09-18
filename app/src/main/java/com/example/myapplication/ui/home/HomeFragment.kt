package com.example.myapplication.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.TransactionAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var transactionAdapter: TransactionAdapter
    private val TAG = "MainActivity"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)


        homeViewModel.init()

        initializeRecycler(root)

        homeViewModel.getMutableTransactionList().observe(this, Observer {
            transactionAdapter.notifyDataSetChanged()
        })

        return root
    }

    private fun initializeRecycler(root : View) {
        Log.d(TAG, "initializeRecycler: ")
        val recyclerView : RecyclerView = root.findViewById(R.id.transactionRecycler)

        transactionAdapter = TransactionAdapter(homeViewModel.getMutableTransactionList().getValue()!!)
        recyclerView.setAdapter(transactionAdapter)
        recyclerView.setLayoutManager(LinearLayoutManager(activity, RecyclerView.VERTICAL, false))

    }
}