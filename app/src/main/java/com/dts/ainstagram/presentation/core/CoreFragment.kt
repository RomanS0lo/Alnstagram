package com.dts.ainstagram.presentation.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class CoreFragment<VB : ViewBinding, VM : ViewModel>(
    @LayoutRes val layoutId: Int
) : Fragment(layoutId) {

    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = onViewBinding(super.onCreateView(inflater, container, savedInstanceState)!!)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onViewReady(view, savedInstanceState)
    }

    abstract fun onViewBinding(view: View): VB
    abstract fun onViewReady(view: View, savedInstanceState: Bundle?)
}
