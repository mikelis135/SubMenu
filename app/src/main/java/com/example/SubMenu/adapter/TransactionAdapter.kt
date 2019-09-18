package com.example.SubMenu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.SubMenu.R
import com.example.SubMenu.swipe.SwipeLayout

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

        holder.refund.setOnClickListener {
            Toast.makeText(holder.amount.context, "${holder.amount.text} Refunded", Toast.LENGTH_SHORT).show()
        }
        holder.reprocess.setOnClickListener {
            Toast.makeText(holder.amount.context, "${holder.amount.text} Reprocessed", Toast.LENGTH_SHORT).show()
        }
        holder.delete.setOnClickListener {
            Toast.makeText(holder.amount.context, "${holder.amount.text} Deleted", Toast.LENGTH_SHORT).show()
        }


        holder.swipeLayout.surfaceView!!.setOnClickListener {
            Toast.makeText(holder.amount.context, "${holder.bank.text} Clicked", Toast.LENGTH_SHORT).show()
        }
        holder.swipeLayout.surfaceView!!.setOnLongClickListener {
            Toast.makeText(holder.amount.context, "${holder.bank.text} Long Clicked", Toast.LENGTH_SHORT).show()
            true
        }
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var bank: TextView
        var date: TextView
        var amount: TextView
        var status: TextView
        var delete: ImageView
        var refund: TextView
        var reprocess: TextView
        var swipeLayout : SwipeLayout

        init {
            bank = itemView.findViewById(R.id.bank)
            date = itemView.findViewById(R.id.date)
            amount = itemView.findViewById(R.id.amount)
            status = itemView.findViewById(R.id.status)
            delete = itemView.findViewById(R.id.delete)
            refund = itemView.findViewById(R.id.refund)
            reprocess = itemView.findViewById(R.id.reprocess)
            swipeLayout = itemView.findViewById(R.id.swipeLayout)
            swipeLayout.showMode = SwipeLayout.ShowMode.PullOut

            swipeLayout.addDrag(SwipeLayout.DragEdge.Left, swipeLayout.findViewById(R.id.leftMenu) as LinearLayout)
            swipeLayout.addDrag(SwipeLayout.DragEdge.Right,swipeLayout.findViewById(R.id.rightMenu) as LinearLayout)

            swipeLayout.addRevealListener(R.id.refund) { child, edge, fraction, distance -> }
            swipeLayout.addRevealListener(R.id.reprocess) { child, edge, fraction, distance -> }

        }

    }

}
