package com.example.SubMenu.ui.transfers

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.SubMenu.Repository.TransactionRepository
import com.example.SubMenu.adapter.Transactions

class TransfersViewModel : ViewModel() {

    var transactionRepository: TransactionRepository? = null
    private var mutableLiveDataTransfersList: MutableLiveData<List<Transactions>>? = null


    fun init() {
        transactionRepository = TransactionRepository.instance
        mutableLiveDataTransfersList = transactionRepository!!.getTransactionData()

    }

    fun getMutableTransfersList() : MutableLiveData<List<Transactions>>{
        return mutableLiveDataTransfersList!!
    }
}