package com.dts.ainstagram.presentation.tab_home.adapter

import com.bumptech.glide.Glide
import com.dts.ainstagram.R
import com.dts.ainstagram.domain.model.Stories
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.single_story_cell.view.*

class StoryCell(private val story: Stories):Item<GroupieViewHolder>() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        Glide.with(viewHolder.itemView)
            .load(story.author.avatar)
            .centerCrop()
            .into(viewHolder.itemView.ivStoryImage)
        viewHolder.itemView.tvStoryNickName.text = story.author.name
    }

    override fun getLayout(): Int {
        return R.layout.single_story_cell
    }
}
