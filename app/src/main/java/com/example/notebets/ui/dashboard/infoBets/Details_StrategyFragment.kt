package com.example.notebets.ui.dashboard.infoBets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R
import com.example.notebets.databinding.FragmentDetailsStrategyBinding
import com.example.notebets.utilits.APP_ACTIVITY

class Details_StrategyFragment : Fragment() {
lateinit var binding: FragmentDetailsStrategyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsStrategyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val details = arguments?.getString("details")
        binding.tvName.text = name
        binding.tvDetails.text = details

        binding.btnBack.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_details_StrategyFragment_to_strategyFragment)
        }
        binding.btnBack2.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_details_StrategyFragment_to_strategyFragment)
        }
    }

}