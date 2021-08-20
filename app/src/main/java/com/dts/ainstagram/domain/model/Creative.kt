package com.dts.ainstagram.domain.model

import java.util.*

open class Creative(
   open val id: Long,
   open val author: User,
   open val content: Content,
   open val crateAt: Date,
   open val url: String
) {

}