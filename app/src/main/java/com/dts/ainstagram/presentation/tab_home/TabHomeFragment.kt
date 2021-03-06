package com.dts.ainstagram.presentation.tab_home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.dts.ainstagram.databinding.FragmentTabHomeBinding
import com.dts.ainstagram.domain.model.*
import com.dts.ainstagram.presentation.tab_home.adapter.PostCell
import com.dts.ainstagram.presentation.tab_home.adapter.StoriesGroupCell
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import java.util.*

class TabHomeFragment : Fragment(com.dts.ainstagram.R.layout.fragment_tab_home) {

    companion object {
        const val NAME = "tab_home_fragment"
    }

    private lateinit var binding: FragmentTabHomeBinding

    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabHomeBinding.bind(
            super.onCreateView(
                inflater,
                container,
                savedInstanceState
            )!!
        )
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        setupObservers()
    }

    private fun setupAdapter() {
        binding.rvPost.adapter = groupAdapter
        val postCell = PostCell(
            Post(
                "Hello",
                "desc",
                1,
                User(1L, "Roman", "https://images.unsplash.com/photo-1517841905240-472988babdf9"),
                Content(
                    1L,
                    Content.Type.IMAGE,
                    "https://images.unsplash.com/photo-1463725876303-ff840e2aa8d5"
                ),
                Date(),
                ""
            )
        )

        val stories = StoriesGroupCell(
            arrayListOf(
                Stories(
                    1L,
                    User(
                        2L,
                        "Nikita",
                        "https://images.unsplash.com/photo-1463725876303-ff840e2aa8d5"
                    ),
                    Content(
                        2L,
                        Content.Type.IMAGE,
                        "https://images.unsplash.com/photo-1502325966718-85a90488dc29"
                    ),
                    Date(),
                    ""
                ),
                Stories(
                    1L,
                    User(
                        2L,
                        "Nikita",
                        "https://images.unsplash.com/photo-1463725876303-ff840e2aa8d5"
                    ),
                    Content(
                        2L,
                        Content.Type.IMAGE,
                        "https://images.unsplash.com/photo-1502325966718-85a90488dc29"
                    ),
                    Date(),
                    ""
                )
            )
        )
        groupAdapter.add(stories)
        groupAdapter.add(postCell)
        groupAdapter.add(postCell)
        groupAdapter.add(postCell)
        groupAdapter.add(postCell)
        groupAdapter.add(postCell)

    }


    private fun setupObservers() {

    }
}
