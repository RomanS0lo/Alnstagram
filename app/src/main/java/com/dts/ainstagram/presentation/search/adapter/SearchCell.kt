package com.dts.ainstagram.presentation.search.adapter

import android.annotation.SuppressLint
import androidx.core.view.updateLayoutParams
import com.bumptech.glide.Glide
import com.dts.ainstagram.R
import com.dts.ainstagram.domain.model.SearchItem
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.serach_cell.view.*
import timber.log.Timber
import kotlin.math.roundToInt

class SearchCell(private val searchItem: SearchItem) : Item<GroupieViewHolder>() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        Timber.d("Element $position -> ${searchItem.size}")
        val widthDivider =
            viewHolder.itemView.resources.getDimensionPixelSize(R.dimen.divider_width) * 2

        val screenWidth =
            viewHolder.itemView.context.resources.displayMetrics.widthPixels - widthDivider

        if (searchItem.size == SearchItem.Size.BIG) {
            val widthDivider =
                viewHolder.itemView.resources.getDimensionPixelSize(R.dimen.divider_width)

            val screenWidth =
                viewHolder.itemView.context.resources.displayMetrics.widthPixels - widthDivider
            val size = ((screenWidth / 3) * 2)
            viewHolder.itemView.ivSearchCell.updateLayoutParams {
                width = size
                height = size
            }
        } else {
            val widthDivider =
                viewHolder.itemView.resources.getDimensionPixelSize(R.dimen.divider_width) * 2

            val screenWidth =
                viewHolder.itemView.context.resources.displayMetrics.widthPixels - widthDivider
            val size = (screenWidth / 3)
            viewHolder.itemView.ivSearchCell.updateLayoutParams {
                width = size
                height = size
            }
        }
        viewHolder.itemView.requestLayout()

        Glide.with(viewHolder.itemView)
            .load(searchItem.url)
            .into(viewHolder.itemView.ivSearchCell)
    }

    override fun getLayout(): Int {
        return R.layout.serach_cell
    }
}