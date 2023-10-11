package com.zw.composetemplate.data

import com.zw.composetemplate.framework.entity.Channel
import kotlinx.coroutines.flow.Flow

interface ChannelDataSource {
    fun getChannelFlow(): Flow<List<Channel>>
}