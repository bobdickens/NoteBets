package com.example.notebets.ui.AddNewFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notebets.R
import com.example.notebets.databinding.FragmentAddNewBinding
import com.example.notebets.models.AppNote
import com.example.notebets.utilits.APP_ACTIVITY
import com.example.notebets.utilits.showToast

class fragment_add_new : Fragment() {

    lateinit var binding: FragmentAddNewBinding

    companion object {
        fun newInstance() = fragment_add_new()
    }

    private lateinit var viewModel: FragmentAddNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddNewBinding.inflate(layoutInflater, container, false)
        return binding.root
    }



    override fun onStart() {
        super.onStart()

        initialisation()

    }



    private fun initialisation() {
        viewModel = ViewModelProvider(this).get(FragmentAddNewViewModel::class.java)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_fragment_add_new_to_navigation_home)

        }




        binding.btnAddNew.setOnClickListener {
            val name = binding.etName.text.toString()
            val date = binding.etDate.text.toString()
            val amount = binding.etAmount.text.toString()
            val score = binding.etScore.text.toString()
            val odds = binding.etOdds.text.toString()
            val descr = binding.etDescription.text.toString()
            val status = if (binding.radioWinLos.checkedRadioButtonId == R.id.radioloose) {"LOOSE"} else {"WIN"}




            if (name.isEmpty()) {
                showToast(getString(R.string.enter_name))
            } else {

                viewModel.insert(AppNote(name = name, date = date, amount = amount, score = score, odds = odds, status = status, description = descr )){
                    APP_ACTIVITY.navController.navigate(R.id.action_fragment_add_new_to_navigation_home)
                }
            }
        }


    }

}