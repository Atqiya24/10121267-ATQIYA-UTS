package com.example.a10119901uts.ui.gallery

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
import com.squareup.picasso.Picasso

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
            "https://drive.google.com/uc?export=download&id=1z81jmHCioY2X4xDVnqPMVyTzfkSjKPvq",
            "https://drive.google.com/uc?export=download&id=1kJ_oiAbieLob7SicJ2Hhbi73Skpk7HTQ",
            "https://drive.google.com/uc?export=download&id=1PLPXcShXc-hz7P_anYH4bWJryBoTW0Rc",
            "https://drive.google.com/uc?export=download&id=1P5qu3dEjtHEoez6bsGkmGvVCZ5zFiSz8",
            "https://drive.google.com/uc?export=download&id=17avfLQVMBUBiAzgFXfAm4_-d1pyPSu4A",
            "https://drive.google.com/uc?export=download&id=1TNK_3Ji0ai8f-7SmIfLo7TbBwQDBcM4N",
            "https://drive.google.com/uc?export=download&id=1fE8iat96WznlhUxFQKFuwSp0OsGl7Mgq",
            "https://drive.google.com/uc?export=download&id=1LSq3MRK87byf0eUAC27RmVluMFQPq3Cp",
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