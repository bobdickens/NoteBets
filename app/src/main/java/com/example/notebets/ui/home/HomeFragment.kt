package com.example.notebets.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.main.MainAdapter
import com.example.notebets.R
import com.example.notebets.databinding.FragmentHomeBinding
import com.example.notebets.models.AppNote
import com.example.notebets.utilits.APP_ACTIVITY
import com.example.notebets.utilits.TYPE_ROOM
import com.example.notebets.utilits.showToast

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var mViewModel : HomeViewModel
    private lateinit var rViewModel: RecyclerVIewModel
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: MainAdapter
    private lateinit var mObserverList: Observer<List<AppNote>>


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

        initializationRecycler()
    }

    private fun initializationRecycler() {
        rViewModel = ViewModelProvider(this).get(RecyclerVIewModel::class.java)
        rViewModel.allNotes.observe(this, mObserverList)

    }

    private fun initialization() {

        mAdapter = MainAdapter()
        mRecyclerView = binding.recyclerView
        mRecyclerView.adapter = mAdapter
        mObserverList = Observer {
            val list = it.asReversed()
            mAdapter.submitList(list)
        }

        mViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        mViewModel.initDataBase(TYPE_ROOM){
            //showToast("Room Initialization")
        }
        binding.btnAdd.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_home_to_fragment_add_new)
        }





    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        rViewModel.allNotes.removeObserver(mObserverList)
        mRecyclerView.adapter = null
    }

    companion object {
        fun click (note: AppNote){
            val bundle = Bundle()
            bundle.putSerializable("note", note)
            APP_ACTIVITY.navController.navigate(R.id.action_navigation_home_to_betFragment, bundle)
        }
    }
}