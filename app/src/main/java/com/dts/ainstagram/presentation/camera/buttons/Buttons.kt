package com.dts.ainstagram.presentation.camera.buttons

import android.content.Context
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class Buttons(private val button: Button, private val context: Context, private var onItemClick: ((Button) -> Unit)) :
    Item<GroupieViewHolder>() {

    override fun bind(viewHolder: com.xwray.groupie.GroupieViewHolder, position: Int) {
        viewHolder.itemView.imageButton.setImageResource(button.resource)
        viewHolder.itemView.imageButton.setOnClickListener {
            onItemClick.invoke(button)
        }
    }

    override fun getLayout(): Int {
        return R.layout.camera_btn_cell
    }

}