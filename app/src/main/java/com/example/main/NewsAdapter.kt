package com.example.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
import com.squareup.picasso.Picasso

class NewsAdapter(private val mList: List<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]


        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text
        holder.textViewName.text = ItemsViewModel.name
        Picasso.get().load(ItemsViewModel.image).into(holder.imageView)

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view_news)
        val textView: TextView = itemView.findViewById(R.id.tv_details_news)
        val textViewName: TextView = itemView.findViewById(R.id.textName_news)
    }
}