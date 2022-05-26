package com.example.a10119901uts.music
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.recyclerview.widget.RecyclerView
import com.example.a10119901uts.R

class VideoAdapter internal constructor(private val youtubeVideoList: List<VideoModel>) :
RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
      return VideoViewHolder(view)
   }
   override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
      holder.videoWeb.loadData(youtubeVideoList[position].videoUrl!!, "text/html", "utf-8")
   }
   inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      var videoWeb: WebView = itemView.findViewById(R.id.webView)
      init {
         videoWeb.settings.javaScriptEnabled = true
         videoWeb.webChromeClient = object : WebChromeClient() {
         }
      }
   }
   override fun getItemCount(): Int {
      return youtubeVideoList.size
   }
}