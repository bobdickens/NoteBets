package com.example.notebets.ui.notifications

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.main.MainAdapter
import com.example.main.NewsAdapter
import com.example.notebets.R
import com.example.notebets.databinding.FragmentNotificationsBinding
import com.example.notebets.models.News
import com.example.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NotificationsFragment : Fragment() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: NewsAdapter

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.recyclerview.layoutManager = LinearLayoutManager(activity)

        val apiInterface = ApiInterface.create().getMovies()

        apiInterface.enqueue( object : Callback<List<News>>{
            override fun onResponse(call: Call<List<News>>?, response: Response<List<News>>?) {
                val adapter = NewsAdapter(response?.body()!!)
                binding.recyclerview.adapter = adapter
            }
            override fun onFailure(call: Call<List<News>>?, t: Throwable?) {

            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}