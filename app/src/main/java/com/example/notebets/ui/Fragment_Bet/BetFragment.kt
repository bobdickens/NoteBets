package com.example.notebets.ui.Fragment_Bet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R
import com.example.notebets.databinding.FragmentBetBinding
import com.example.notebets.models.AppNote
import com.example.notebets.utilits.APP_ACTIVITY

class BetFragment : Fragment() {

    private lateinit var binding: FragmentBetBinding
    private lateinit var mViewModel: BetViewModel
    private lateinit var mCurrentNote: AppNote

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBetBinding.inflate(layoutInflater, container, false)
        mCurrentNote = arguments?.getSerializable("note") as AppNote
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        init()
    }

    private fun init() {
        mViewModel = ViewModelProvider(this).get(BetViewModel::class.java)
        //binding.etName.text = mCurrentNote.name
        binding.etName.text = mCurrentNote.name
        binding.etDate.text = mCurrentNote.date
        binding.tvScore.text = mCurrentNote.score
        binding.tvAmount.text = mCurrentNote.amount
        binding.tvDescription.text = mCurrentNote.description
        binding.tvStatus.text = mCurrentNote.status
        binding.tvOdds.text = mCurrentNote.odds


        binding.btnBack.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_betFragment_to_navigation_home)
        }


        binding.btnDelete.setOnClickListener {
            mViewModel.delete(mCurrentNote){
                APP_ACTIVITY.navController.navigate(R.id.action_betFragment_to_navigation_home)
            }
        }


    }

}