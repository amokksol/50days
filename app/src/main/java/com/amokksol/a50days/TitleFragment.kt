package com.amokksol.a50days

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.amokksol.a50days.databinding.FirstScreenFragmentBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class TitleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //создаем объект привязки фрагмента к перой активности
        val binding = DataBindingUtil.inflate<FirstScreenFragmentBinding>(inflater,
                R.layout.first_screen_fragment, container, false)
        return binding.root
    }
}

