package com.dts.ainstagram.domain.model

data class SearchItem(
    val url: String,
    val tag: Tag,
    var size: Size = Size.NONE
) {


    enum class Tag {
        NATURE, FOOD,
    }

    enum class Size {
        NONE, SMALL, BIG
    }
}
