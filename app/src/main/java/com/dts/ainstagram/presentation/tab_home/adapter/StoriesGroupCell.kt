package com.dts.ainstagram.presentation.tab_home.adapter

import com.dts.ainstagram.R
import com.dts.ainstagram.domain.model.Stories
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.stories_cell.view.*

class StoriesGroupCell(private val stories: List<Stories>) : Item<GroupieViewHolder>() {

    private val adapter = GroupAdapter<GroupieViewHolder>()

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        for (story in stories) {
            val cell = StoryCell(story)
            adapter.add(cell)
        }

        viewHolder.itemView.rvStories.adapter = adapter
    }

    override fun getLayout(): Int {
        return R.layout.stories_cell
    }
}
