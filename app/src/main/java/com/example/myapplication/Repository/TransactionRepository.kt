package com.example.myapplication.Repository

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.adapter.Transactions


class TransactionRepository {


    private lateinit var instance : TransactionRepository
    private var transactionList : ArrayList<Transactions> = arrayListOf()
    private var mutableTransactionData : MutableLiveData<List<Transactions>> = MutableLiveData()

    fun getInstance() : TransactionRepository{
            return TransactionRepository()
        }

    fun getTransactionData() : MutableLiveData<List<Transactions>>{

        if (transactionList.size != 0){
            mutableTransactionData.value = transactionList
            return mutableTransactionData
        }
        setTransactionData();
        mutableTransactionData.value = transactionList
        return mutableTransactionData
    }

    fun setTransactionData() {
        transactionList.add(Transactions("UBA", "10-10-2019", "100", "Approved"))
        transactionList.add(Transactions("GTB", "10-10-2019", "100", "Processing"))
        transactionList.add(Transactions("Zenith", "10-10-2019", "100", "Pending"))
        transactionList.add(Transactions("Wema", "10-10-2019", "100", "Approved"))
    }

}