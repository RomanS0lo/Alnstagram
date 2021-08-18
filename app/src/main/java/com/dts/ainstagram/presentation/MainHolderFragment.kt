package com.dts.ainstagram.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentMainHolderBinding
import com.dts.ainstagram.presentation.core.CoreFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainHolderFragment: CoreFragment<FragmentMainHolderBinding, MainHolderViewModel>(R.layout.fragment_main_holder) {

    private val viewModel: MainHolderViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentMainHolderBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        viewModel.log()
    }
}
