package com.example.notebets.ui.dashboard.infoBets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R
import com.example.notebets.databinding.FragmentTypeBinding
import com.example.notebets.utilits.APP_ACTIVITY

class TypeFragment : Fragment() {
    lateinit var binding: FragmentTypeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTypeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        binding.btnBack.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_navigation_dashboard)
        }

        binding.btnMoneylines.setOnClickListener {
            bundle.putString("name", getString(R.string.moneylines))
            bundle.putString("details", getString(R.string.moneylines_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnTotalRounds.setOnClickListener {
            bundle.putString("name", getString(R.string.total_rounds))
            bundle.putString("details", getString(R.string.total_rounds_detail))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnParlays.setOnClickListener {
            bundle.putString("name", getString(R.string.parlays))
            bundle.putString("details", getString(R.string.parlays_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnFutures.setOnClickListener {
            bundle.putString("name", getString(R.string.futures))
            bundle.putString("details", getString(R.string.futures_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnPropBets.setOnClickListener {
            bundle.putString("name", getString(R.string.prop_bets))
            bundle.putString("details", getString(R.string.prop_bets_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnBettingAgainstTheSpread.setOnClickListener {
            bundle.putString("name", getString(R.string.betting_against_the_spread))
            bundle.putString("details", getString(R.string.betting_against_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnTeaserBets.setOnClickListener {
            bundle.putString("name", getString(R.string.teaser_bets))
            bundle.putString("details", getString(R.string.teaser_bets_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
        binding.btnOverUnder.setOnClickListener {
            bundle.putString("name", getString(R.string.over_under))
            bundle.putString("details", getString(R.string.over_never_details))
            APP_ACTIVITY.navController.navigate(R.id.action_typeFragment_to_detailsFragment, bundle)
        }
    }


}