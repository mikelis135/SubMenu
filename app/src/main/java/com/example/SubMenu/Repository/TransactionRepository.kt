package com.example.SubMenu.Repository

import androidx.lifecycle.MutableLiveData
import com.example.SubMenu.adapter.Transactions


class TransactionRepository {


    private var transactionList : ArrayList<Transactions> = arrayListOf()
    private var mutableTransactionData : MutableLiveData<List<Transactions>> = MutableLiveData()

    companion object{
        val instance = TransactionRepository()
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

    private fun setTransactionData() {
        transactionList.add(Transactions("Access Bank | 06900000PW", "15 Sep 2019 12:23 pm", "₦200.00", "APPROVED"))
        transactionList.add(Transactions("GT Bank | 05900400PW", "14 Sep 2019 2:23 pm", "₦100.00", "PROCESSING"))
        transactionList.add(Transactions("Zenith Bank | 06300000RQ", "12 Sep 2019 1:23 pm", "₦100.00", "RETURNED"))
        transactionList.add(Transactions("Wema Bank | 06800000PE", "10 Sep 2019 12:23 am", "₦100.00", "DECLINED"))
    }

}