package com.dts.ainstagram.presentation.tab_home.adapter

import com.bumptech.glide.Glide
import com.dts.ainstagram.R
import com.dts.ainstagram.domain.model.Post
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.post_cell.view.*

class PostCell(private val post: Post) : Item<GroupieViewHolder>() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.tvNickname.text = post.author.name
        Glide.with(viewHolder.itemView)
            .load(post.author.avatar)
            .centerCrop()
            .into(viewHolder.itemView.ivAvatar)
        Glide.with(viewHolder.itemView)
            .load(post.content.url)
            .into(viewHolder.itemView.ivPostImage)
    }

    override fun getLayout(): Int {
        return R.layout.post_cell
    }
}
