package com.example.a10119901uts.music

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a10119901uts.R
import com.example.a10119901uts.databinding.FragmentMusicBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import java.util.*
import kotlin.collections.ArrayList

class MusicFragment : Fragment() {

    private var _binding: FragmentMusicBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
     val api_key =  "AIzaSyBOMI_2S8nsqPa-D3rTPNBgvxih9ISsbt0"
    private var youtubeVideos = Vector<VideoModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMusicBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val data = ArrayList<MusicModel>()
        data.add(MusicModel(R.drawable.ic_music2, "Helena", "My Chemical Romance"))
        data.add(MusicModel(R.drawable.ic_music2, "Dont Look Back in Anger", "Oasis"))
        data.add(MusicModel(R.drawable.ic_music2, "Boulevard of Broken Dreams", "Green Day"))
        data.add(MusicModel(R.drawable.ic_music2, "I Miss You", "Blink-182"))
        data.add(MusicModel(R.drawable.ic_music2, "Misery Business", "Paramore"))

        val recyclerview = root.findViewById<RecyclerView>(R.id.rv_music)
        recyclerview.layoutManager = LinearLayoutManager(getActivity())
        recyclerview.adapter = MusicAdapter(data)

        //VIDEO
        youtubeVideos.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www" + ".youtube.com/embed/tEbhEWoO0OQ\" frameborder=\"0\" allowfullscreen></iframe>"))

        val recyclerview2 = root.findViewById<RecyclerView>(R.id.rv_video)
        recyclerview2.layoutManager = LinearLayoutManager(getActivity())
        recyclerview2.adapter = VideoAdapter(youtubeVideos)

//        val ytPlayer = root.findViewById<YouTubePlayerView>(R.id.ytPlayer)
//        ytPlayer.initialize(api_key, object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(
//                provider: YouTubePlayer.Provider?,
//                player: YouTubePlayer?,
//                p2: Boolean
//            ) {
//                player?.loadVideo("HzeK7g8cD0Y")
//                player?.play()
//            }
//
//            override fun onInitializationFailure(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubeInitializationResult?
//            ) {
//                Toast.makeText(getActivity(), "Video player Failed", Toast.LENGTH_SHORT).show()
//            }
//        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}