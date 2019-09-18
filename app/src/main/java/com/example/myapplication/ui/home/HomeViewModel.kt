package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Repository.TransactionRepository
import com.example.myapplication.adapter.Transactions

class HomeViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    var transactionRepository: TransactionRepository? = null
    private var mutableLiveDataTransactionList: MutableLiveData<List<Transactions>>? = null

    val text: LiveData<String> = _text


   fun init() {
        transactionRepository = TransactionRepository()
        mutableLiveDataTransactionList = transactionRepository!!.getTransactionData()

    }

    fun getMutableTransactionList() : MutableLiveData<List<Transactions>>{
        return mutableLiveDataTransactionList!!
    }
}