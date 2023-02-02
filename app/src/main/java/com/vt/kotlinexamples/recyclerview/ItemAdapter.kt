package com.vt.kotlinexamples.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vt.kotlinexamples.R
import com.bumptech.glide.Glide

class ItemAdapter(private val dataList: List<Recycler_Item >, private val context: Context) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = dataList[position]
//        holder.imageView.setImageBitmap(data.image)
        holder.textView.text = data.name

        Glide.with(context)
            .load("https://www.shutterstock.com/image-vector/sample-red-square-grunge-stamp-260nw-338250266.jpg")
            .into(holder.imageView)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)

    }

    override fun getItemCount() = dataList.size
}
