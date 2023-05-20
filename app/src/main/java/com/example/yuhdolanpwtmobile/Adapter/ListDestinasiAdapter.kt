package com.example.yuhdolanpwtmobile.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.R
import com.example.yuhdolanpwtmobile.SinglePageActivity

class ListDestinasiAdapter: RecyclerView.Adapter<ListDestinasiAdapter.ListDestinasiViewHolder>() {
    class ListDestinasiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDestinasiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_destinasi, parent, false)
        return ListDestinasiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ListDestinasiViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, SinglePageActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

}