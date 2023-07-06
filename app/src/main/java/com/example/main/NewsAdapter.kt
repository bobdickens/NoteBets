package com.example.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.notebets.R
import com.example.notebets.databinding.ItemBinding
import com.example.notebets.databinding.ItemNewsBinding
import com.example.notebets.databinding.NoteItemBinding
import com.example.notebets.models.AppNote
import com.example.notebets.models.FaqModel
import com.example.notebets.models.News
import com.example.notebets.ui.home.HomeFragment

class NewsAdapter: ListAdapter<News, NewsAdapter.Holder>(Comparator()){
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemNewsBinding.bind(view)

        fun bind (item: News) = with(binding){
//            tvDetails.text = item.descr
//            textName.text = item.name

        }
    }

    class Comparator : DiffUtil.ItemCallback<News>(){
        override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
            return  oldItem == newItem

        }

        override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))

    }
}