package com.example.SubMenu.ui.transfers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.SubMenu.R
import com.example.SubMenu.adapter.TransactionAdapter

class TransfersFragment : Fragment() {

    private lateinit var transfersViewModel: TransfersViewModel
    private lateinit var transactionAdapter: TransactionAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        transfersViewModel =
            ViewModelProviders.of(this).get(TransfersViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        transfersViewModel.init()

        initializeRecycler(root)

        transfersViewModel.getMutableTransfersList().observe(this, Observer {
            transactionAdapter.notifyDataSetChanged()
        })

        return root
    }

    private fun initializeRecycler(root : View) {
        val recyclerView : RecyclerView = root.findViewById(R.id.transfersRecycler)

        transactionAdapter = TransactionAdapter(transfersViewModel.getMutableTransfersList().getValue()!!)
        recyclerView.setAdapter(transactionAdapter)
        recyclerView.setLayoutManager(LinearLayoutManager(activity, RecyclerView.VERTICAL, false))

    }
}