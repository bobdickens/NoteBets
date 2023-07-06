package com.example.notebets.ui.dashboard.infoBets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R
import com.example.notebets.databinding.FragmentStrategyBinding
import com.example.notebets.utilits.APP_ACTIVITY

class StrategyFragment : Fragment() {
lateinit var binding: FragmentStrategyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStrategyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        binding.btnBack3.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_navigation_dashboard)
        }

        binding.btn1x.setOnClickListener {
            bundle.putString("name", getString(R.string._1x_on_home_outsiders_strategy))
            bundle.putString("details", getString(R.string.x_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }

        binding.beat.setOnClickListener {
            bundle.putString("name", getString(R.string.beat_the_bookies_with_the_overlyzer_live_tool))
            bundle.putString("details", getString(R.string.beat_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }
        binding.btnAllIn.setOnClickListener {
            bundle.putString("name", getString(R.string.all_in_on_odds_at_1_20_strategy))
            bundle.putString("details", getString(R.string.all_in_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }

        binding.btn123System.setOnClickListener {
            bundle.putString("name", getString(R.string.the_1_3_2_6_system))
            bundle.putString("details", getString(R.string.sysytem_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }

        binding.btnFibbonacci.setOnClickListener {
            bundle.putString("name", getString(R.string.the_fibonacci_betting_system))
            bundle.putString("details", getString(R.string.fibbonacci_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }

        binding.btnKellyFormula.setOnClickListener {
            bundle.putString("name", getString(R.string.the_kelly_formula))
            bundle.putString("details", getString(R.string.kelly_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }

        binding.dutching.setOnClickListener {
            bundle.putString("name", getString(R.string.dutching_in_sports_betting))
            bundle.putString("details", getString(R.string.dutching_in_sports_betting))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }
        binding.early.setOnClickListener {
            bundle.putString("name", getString(R.string.early_cashout_in_sports_betting))
            bundle.putString("details", getString(R.string.early_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }
        binding.betLive.setOnClickListener {
            bundle.putString("name", getString(R.string.bet_live_on_over_1_5_goals))
            bundle.putString("details", getString(R.string.beat_live_d))
            APP_ACTIVITY.navController.navigate(R.id.action_strategyFragment_to_details_StrategyFragment, bundle)
        }
    }

}