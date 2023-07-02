package com.example.notebets.ui.Fragment_Bet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R

class BetFragment : Fragment() {

    companion object {
        fun newInstance() = BetFragment()
    }

    private lateinit var viewModel: BetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}