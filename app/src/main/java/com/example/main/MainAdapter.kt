package com.example.main

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.Keep
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.notebets.R
import com.example.notebets.databinding.NoteItemBinding
import com.example.notebets.models.AppNote

@Keep
class MainAdapter:  ListAdapter<AppNote, MainAdapter.Holder>(Comparator()){
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = NoteItemBinding.bind(view)

        fun bind (item: AppNote) = with(binding){
            //namePlayers.text = item.name
            tvItemName.text = item.name

        }
    }

    class Comparator : DiffUtil.ItemCallback<AppNote>(){
        override fun areItemsTheSame(oldItem: AppNote, newItem: AppNote): Boolean {
            return  oldItem == newItem

        }

        override fun areContentsTheSame(oldItem: AppNote, newItem: AppNote): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))

    }
}