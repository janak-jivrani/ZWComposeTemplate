package com.zw.composetemplate.data.repositories

import com.zw.composetemplate.data.ChannelDataSource
import com.zw.composetemplate.framework.entity.Channel
import kotlinx.coroutines.flow.Flow

class ChannelRepository(private val mChannelDataSource: ChannelDataSource) {
    fun getChannelFlow(): Flow<List<Channel>> = mChannelDataSource.getChannelFlow()
}