package com.dts.ainstagram.domain.model

import java.util.*

data class Post(
    val title: String,
    val description: String,
    override val id: Long,
    override val author: User,
    override val content: Content,
    override val crateAt: Date,
    override val url: String
) : Creative(id, author, content, crateAt, url)
