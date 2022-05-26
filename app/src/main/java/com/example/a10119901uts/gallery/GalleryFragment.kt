package com.example.a10119901uts.gallery

import android.icu.number.NumberFormatter.with
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a10119901uts.databinding.FragmentGalleryBinding
import androidx.recyclerview.widget.*
import com.example.a10119901uts.R
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    private val binding get() = _binding!!
    private var manager : StaggeredGridLayoutManager? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val data = listOf(
            "https://freeplaceid.000webhostapp.com/assets/fauzan/2.jpg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/3.jpg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/4.jpeg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/5.jpeg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/6.jpeg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/7.jpg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/8.jpg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/9.jpg",
            "https://freeplaceid.000webhostapp.com/assets/fauzan/11.jpeg",
        )


        val recyclerViewGallery = root.findViewById<RecyclerView>(R.id.rv_gallery)
        manager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerViewGallery.setLayoutManager(manager)
        recyclerViewGallery.adapter = GalleryAdapter(data)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}