package com.dts.ainstagram.presentation.search

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentSearchBinding
import com.dts.ainstagram.presentation.core.CoreFragment
import com.dts.ainstagram.presentation.search.adapter.SearchCell
import com.dts.gridlayoutmanager.SpannedGridLayoutManager
import com.xwray.groupie.GroupieAdapter


class SearchFragment :
    CoreFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search) {

    private val viewModel: SearchViewModel by viewModels()

    private val adapter = GroupieAdapter()

    override fun onViewBinding(view: View) = FragmentSearchBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        setupAdapter()
    }

    private fun setupAdapter() {

        val gridLayoutManager = SpannedGridLayoutManager(
            { position ->
                if (position % 6 == 0 || position % 6 == 4) {
                    SpannedGridLayoutManager.SpanInfo(2, 2)
                } else {
                    SpannedGridLayoutManager.SpanInfo(1, 1)
                }
            },
            3,
            1f
        )

        binding.rvSerach.layoutManager = gridLayoutManager

        val wDividerItemDecoration = DividerItemDecoration(
            binding.rvSerach.context,
            DividerItemDecoration.HORIZONTAL
        )
        val hDividerItemDecoration = DividerItemDecoration(
            binding.rvSerach.context,
            DividerItemDecoration.VERTICAL
        )
        ContextCompat.getDrawable(requireContext(), R.drawable.divider_horizontal)?.let { image ->
            wDividerItemDecoration.setDrawable(image)

        }
        ContextCompat.getDrawable(requireContext(), R.drawable.divider_vertical)?.let { image ->
            hDividerItemDecoration.setDrawable(image)
        }
        binding.rvSerach.addItemDecoration(hDividerItemDecoration)
        binding.rvSerach.addItemDecoration(wDividerItemDecoration)
        binding.rvSerach.adapter = adapter
        adapter.addAll(viewModel.fetchData().map { SearchCell(it) })
    }
}