package com.example.Business_Converter.Gold

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Business_Converter.R

class GoldAdapter: RecyclerView.Adapter<GoldAdapter.GoldViewHolder>() {

    private var goldList = emptyList<GoldModelItem>()

    class GoldViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var goldDataTextView: TextView = itemView.findViewById(R.id.goldDataTextView)
        var goldCenaTextView: TextView = itemView.findViewById(R.id.goldCenaTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoldViewHolder {
        return GoldViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.gold_help_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return goldList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: GoldViewHolder, position: Int) {
        holder.goldDataTextView.text = goldList[position].data
        holder.goldCenaTextView.text = goldList[position].cena.toString()

    }

    fun setData(newGoldList: List<GoldModelItem>){
        goldList = newGoldList
        notifyDataSetChanged()
    }



}