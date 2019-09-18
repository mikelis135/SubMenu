package com.example.SubMenu.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.SubMenu.Repository.TransactionRepository
import com.example.SubMenu.adapter.Transactions

class HomeViewModel : ViewModel() {

    var transactionRepository: TransactionRepository? = null
    private var mutableLiveDataTransactionList: MutableLiveData<List<Transactions>>? = null

   fun init() {
       transactionRepository = TransactionRepository.instance
        mutableLiveDataTransactionList = transactionRepository!!.getTransactionData()

    }

    fun getMutableTransactionList() : MutableLiveData<List<Transactions>>{
        return mutableLiveDataTransactionList!!
    }
}