package com.amokksol.a50days

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.amokksol.a50days.databinding.FirstScreenFragmentBinding


class TitleFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //создаем объект привязки фрагмента к перой активности
        //используем DataBindingUtil
        val binding = DataBindingUtil.inflate<FirstScreenFragmentBinding>(inflater,
                R.layout.first_screen_fragment, container, false)
        //реакция на нажатие кнопки добавить цель
        binding.addButton.setOnClickListener { view:View ->
            view.findNavController().navigate(R.id.action_firstScreen_to_changeTarget)
        }
        return binding.root
    }
}

