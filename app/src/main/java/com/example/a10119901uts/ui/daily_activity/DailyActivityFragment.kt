package com.example.a10119901uts.ui.daily_activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.a10119901uts.databinding.FragmentDailyActivityBinding

class DailyActivityFragment : Fragment() {

    private var _binding: FragmentDailyActivityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dailyActivityViewModel =
            ViewModelProvider(this).get(DailyActivityViewModel::class.java)

        _binding = FragmentDailyActivityBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}