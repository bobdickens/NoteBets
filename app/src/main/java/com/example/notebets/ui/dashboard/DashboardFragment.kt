package com.example.notebets.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.notebets.R
import com.example.notebets.databinding.FragmentDashboardBinding
import com.example.notebets.utilits.APP_ACTIVITY

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTypes.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_dashboard_to_typeFragment)
        }
        binding.btnStrategyBets.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_dashboard_to_strategyFragment)
        }
        binding.btnFAQ.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_dashboard_to_FAQFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}