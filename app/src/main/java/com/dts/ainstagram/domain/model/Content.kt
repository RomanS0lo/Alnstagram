package com.dts.ainstagram.domain.model

data class Content(
    val id: Long,
    val type: Type,
    val url: String
) {

    enum class Type {
        IMAGE, VIDEO

    }
}

