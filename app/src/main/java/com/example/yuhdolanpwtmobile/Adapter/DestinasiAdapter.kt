package com.example.yuhdolanpwtmobile.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.R

class DestinasiAdapter: RecyclerView.Adapter<DestinasiAdapter.DestinasiViewHolder>() {
    class DestinasiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinasiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_destinasi_card, parent, false)
        return DestinasiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: DestinasiViewHolder, position: Int) {

    }
}