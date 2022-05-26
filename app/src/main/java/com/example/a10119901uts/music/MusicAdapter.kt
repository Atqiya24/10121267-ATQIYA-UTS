package com.example.a10119901uts.music

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a10119901uts.R

class MusicAdapter(private val data:List<MusicModel>) : RecyclerView.Adapter<MusicAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(parent:View):RecyclerView.ViewHolder(parent){
        val img     = parent.findViewById<ImageView>(R.id.iv_music)
        val title   = parent.findViewById<TextView>(R.id.tv_title)
        val singer  = parent.findViewById<TextView>(R.id.tv_singer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_music,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.img.setImageResource(data[position].image)
        holder.title.setText(data[position].title)
        holder.singer.setText(data[position].singer)
    }
}