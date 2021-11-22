package com.dts.ainstagram.presentation.search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentSearchBinding
import com.dts.ainstagram.presentation.core.CoreFragment

class SearchFragment :
    CoreFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search) {

    private val viewModel: SearchViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentSearchBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
    }
}