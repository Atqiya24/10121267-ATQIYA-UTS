package com.example.a10119901uts.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import android.content.Intent
import android.net.Uri
import com.example.a10119901uts.databinding.FragmentProfileBinding
import com.example.a10119901uts.R
import androidx.appcompat.widget.AppCompatButton

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val profileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnPhone = root.findViewById<AppCompatButton>(R.id.btn_phone)
        val btnGmail = root.findViewById<AppCompatButton>(R.id.btn_gmail)
        val btnIg = root.findViewById<AppCompatButton>(R.id.btn_ig)
        val btnMaps = root.findViewById<AppCompatButton>(R.id.btn_maps)

        btnPhone.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://api.whatsapp.com/send?phone=6289519422810")
            startActivity(openURL)
        }

        btnGmail.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("mailto:fauzanabdussalam99@gmail.com")
            startActivity(openURL)
        }

        btnIg.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.instagram.com/fauzan_abdussalam")
            startActivity(openURL)
        }

        btnMaps.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://goo.gl/maps/Pj5tS9fuGgJEdMaL8 ")
            startActivity(openURL)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}