package com.example.notebets.ui.AddNewFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R

class fragment_add_new : Fragment() {

    companion object {
        fun newInstance() = fragment_add_new()
    }

    private lateinit var viewModel: FragmentAddNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_new, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentAddNewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}