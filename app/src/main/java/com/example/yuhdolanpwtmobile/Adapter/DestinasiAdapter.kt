package com.example.yuhdolanpwtmobile.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.R
import com.example.yuhdolanpwtmobile.SinglePageActivity

class DestinasiAdapter: RecyclerView.Adapter<DestinasiAdapter.DestinasiViewHolder>() {
    inner class DestinasiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var btnDestinasi = itemView.findViewById<View>(R.id.cv_destinasi_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinasiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_destinasi_card, parent, false)
        return DestinasiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: DestinasiViewHolder, position: Int) {
        holder.btnDestinasi.setOnClickListener {
            val intent = Intent(holder.itemView.context, SinglePageActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}