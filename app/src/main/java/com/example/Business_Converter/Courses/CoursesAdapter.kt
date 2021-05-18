package com.example.Business_Converter.Courses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Business_Converter.R

class CoursesAdapter: RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

    private var ratesList = emptyList<Rate>()
    class CoursesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var codetxt: TextView = itemView.findViewById(R.id.codetxt)
        var currencytxt: TextView = itemView.findViewById(R.id.currencytxt)
        var midtxt: TextView = itemView.findViewById(R.id.midtxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        return CoursesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rates_help_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return ratesList.size

    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.currencytxt.text = ratesList[position].currency
        holder.codetxt.text = ratesList[position].code
        holder.midtxt.text = ratesList[position].mid.toString()
    }

    fun setData(newRatesList: List<Rate>) {
        ratesList = newRatesList
        notifyDataSetChanged()

    }

}




