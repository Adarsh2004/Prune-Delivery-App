package com.example.prunedeliveryapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.prunedeliveryapplication.R

class AddressSelectionAdapter(private val arrayListTrivia: ArrayList<String>, private val context: Context,
                              private val interfaceOnGoalSelected: GoalSelectedInterface, private var row_index: Int) : RecyclerView.Adapter<AddressSelectionAdapter.ViewFitnessLevelHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewFitnessLevelHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.select_address_adapter, parent, false)
        return ViewFitnessLevelHolder(view)
    }

    override fun onBindViewHolder(holder: ViewFitnessLevelHolder, position: Int) {

        holder.title.text = arrayListTrivia[position]



        holder.parent_layout_items.setOnClickListener(View.OnClickListener {
            row_index = position
            interfaceOnGoalSelected.onFitnessLevelSelection(position,arrayListTrivia[position])
            notifyDataSetChanged()
        })



        if (row_index == position) {
            holder.parent_layout_items.setBackgroundResource(R.drawable.row_selected_color)
            holder.title.setTextColor(ContextCompat.getColor(context, R.color.white))

        } else {
            holder.parent_layout_items.setBackgroundResource(R.drawable.row_not_selected_color)
            holder.title.setTextColor(ContextCompat.getColor(context, R.color.light_black))

        }

    }

    override fun getItemCount(): Int {
        return try {
            arrayListTrivia.size
        } catch (e: Exception) {
            e.printStackTrace()
            0
        }
    }

    inner class ViewFitnessLevelHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)

        var parent_layout_items: RelativeLayout = itemView.findViewById(R.id.parent_layout_items)


    }


    interface GoalSelectedInterface {

        fun onFitnessLevelSelection(position: Int, title: String)

    }


}
