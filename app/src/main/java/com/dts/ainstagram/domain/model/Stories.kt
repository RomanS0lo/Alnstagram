package com.dts.ainstagram.domain.model

import java.util.*

data class Stories(
    override val id: Long,
    override val author: User,
    override val content: Content,
    override val crateAt: Date,
    override val url: String,
    var isSeen: Boolean = false
): Creative(id, author, content, crateAt, url)
