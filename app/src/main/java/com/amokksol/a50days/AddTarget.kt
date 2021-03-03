package com.amokksol.a50days

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.amokksol.a50days.databinding.AddTargetActivityBinding

class AddTarget:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<AddTargetActivityBinding>(inflater,
                R.layout.add_target_activity, container, false)
        return binding.root
    }

}