package com.sample.project.benchmarking.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.project.benchmarking.R
import com.sample.project.benchmarking.data.model.Blog
import com.sample.project.benchmarking.ui.main.adapter.MainAdapter.DataViewHolder
import kotlinx.android.synthetic.main.item_layout.view.imageViewAvatar
import kotlinx.android.synthetic.main.item_layout.view.textViewCategory
import kotlinx.android.synthetic.main.item_layout.view.textViewTitle

class MainAdapter(private val blogs: ArrayList<Blog>) : RecyclerView.Adapter<DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(blog: Blog) {
            itemView.apply {
                textViewTitle.text = blog.title
                textViewCategory.text = blog.category
                Glide.with(imageViewAvatar.context)
                    .load(blog.image)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = blogs.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(blogs[position])
    }

    fun addUsers(blogs: List<Blog>) {
        this.blogs.apply {
            clear()
            addAll(blogs)
        }

    }
}