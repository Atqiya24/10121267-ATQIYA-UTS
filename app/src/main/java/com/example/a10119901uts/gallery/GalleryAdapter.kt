package com.example.a10119901uts.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.a10119901uts.R
import com.squareup.picasso.Picasso

class GalleryAdapter(private val data:List<String>) : RecyclerView.Adapter<GalleryAdapter.CustomViewHolder>() {

    private val picasso = Picasso.get()

    inner class CustomViewHolder(parent:View):RecyclerView.ViewHolder(parent){
        val img = parent.findViewById<ImageView>(R.id.iv_gallery)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_gallery,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
//        holder.img.setImageResource(data[position].img)
        picasso.load(data[position]).into(holder.img)
    }
}