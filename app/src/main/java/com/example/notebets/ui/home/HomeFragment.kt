package com.example.notebets.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.notebets.R
import com.example.notebets.databinding.FragmentHomeBinding
import com.example.notebets.utilits.APP_ACTIVITY
import com.example.notebets.utilits.TYPE_ROOM
import com.example.notebets.utilits.showToast

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var mViewModel : HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        mViewModel.initDataBase(TYPE_ROOM){
            showToast("Привет")
        }

        binding.btnAdd.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_home_to_fragment_add_new)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}