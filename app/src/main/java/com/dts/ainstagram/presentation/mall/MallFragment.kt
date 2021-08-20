package com.dts.ainstagram.presentation.mall

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentMallBinding
import com.dts.ainstagram.presentation.core.CoreFragment

class MallFragment: CoreFragment<FragmentMallBinding, MallFragmentViewModel>(R.layout.fragment_mall){

    private val viewModel: MallFragmentViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentMallBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {

    }

}