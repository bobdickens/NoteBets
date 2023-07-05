package com.example.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.Keep
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.notebets.R
import com.example.notebets.databinding.ItemBinding
import com.example.notebets.models.FaqModel


@Keep
class Adapter: ListAdapter<FaqModel, Adapter.Holder>(Comparator()){
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemBinding.bind(view)

        fun bind (item: FaqModel) = with(binding){
            tvDetails.text = item.descr
            textName.text = item.name

        }
    }

    class Comparator : DiffUtil.ItemCallback<FaqModel>(){
        override fun areItemsTheSame(oldItem: FaqModel, newItem: FaqModel): Boolean {
            return  oldItem == newItem

        }

        override fun areContentsTheSame(oldItem: FaqModel, newItem: FaqModel): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))

    }
}