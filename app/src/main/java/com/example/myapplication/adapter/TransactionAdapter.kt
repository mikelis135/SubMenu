package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.swipe.SwipeLayout
import com.example.myapplication.swipe.ViewHelper

class TransactionAdapter(private val transactionList: List<Transactions>) :
    RecyclerView.Adapter<TransactionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bank.text = transactionList[position].bankName
        holder.date.text = transactionList[position].date
        holder.amount.text = transactionList[position].amount
        holder.status.text = transactionList[position].status

    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var bank: TextView
        var date: TextView
        var amount: TextView
        var status: TextView
        var swipeLayout : SwipeLayout

        init {
            bank = itemView.findViewById(R.id.bank)
            date = itemView.findViewById(R.id.date)
            amount = itemView.findViewById(R.id.amount)
            status = itemView.findViewById(R.id.status)
            swipeLayout = itemView.findViewById(R.id.swipeLayout) as SwipeLayout
            swipeLayout.showMode = SwipeLayout.ShowMode.PullOut

            val starBottView =swipeLayout.findViewById(R.id.starbott) as LinearLayout
            swipeLayout.addDrag(SwipeLayout.DragEdge.Left, swipeLayout.findViewById(R.id.bottom_wrapper) as LinearLayout)
            swipeLayout.addDrag(SwipeLayout.DragEdge.Right,swipeLayout.findViewById(R.id.bottom_wrapper_2) as LinearLayout)
            swipeLayout.addDrag(SwipeLayout.DragEdge.Top, starBottView)
            swipeLayout.addDrag(SwipeLayout.DragEdge.Bottom, starBottView)
            swipeLayout.addRevealListener(R.id.delete) { child, edge, fraction, distance -> }


            swipeLayout.surfaceView!!.setOnClickListener {
            }
            swipeLayout.surfaceView!!.setOnLongClickListener {
                true
            }

            swipeLayout.addRevealListener(R.id.starbott) { child, edge, fraction, distance ->
                val star = child.findViewById(R.id.star) as ImageView
                val d = (child.height / 2 - star.height / 2).toFloat()
                ViewHelper.setTranslationY(star, d * fraction)
                ViewHelper.setScaleX(star, fraction + 0.6f)
                ViewHelper.setScaleY(star, fraction + 0.6f)
            }
        }

    }

}
