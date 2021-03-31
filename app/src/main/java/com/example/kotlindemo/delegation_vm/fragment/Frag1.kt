package com.example.kotlindemo.delegation_vm.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.kotlindemo.R
import com.example.kotlindemo.delegation_vm.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.frag1.*

class Frag1  : Fragment(R.layout.frag1) {

    private val viewModel by viewModels<TestViewModel>()

    private val sharedViewModel by activityViewModels<TestViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.data.observe(viewLifecycleOwner, Observer {
            tv1.text = it.toString()
        })

        btLiveData1.setOnClickListener {
            sharedViewModel.add()
        }

        btJump1.setOnClickListener {
            findNavController().navigate(R.id.action_frag1_to_frag2)
        }
    }


}