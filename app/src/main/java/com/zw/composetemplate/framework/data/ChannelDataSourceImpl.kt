package com.zw.composetemplate.framework.data

import com.zw.composetemplate.data.ChannelDataSource
import com.zw.composetemplate.framework.dao.ChannelDao
import com.zw.composetemplate.framework.entity.Channel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

class ChannelDataSourceImpl(val channelDao: ChannelDao) : ChannelDataSource {
    override fun getChannelFlow(): Flow<List<Channel>> {
        return channelDao.getChannelFlow()
            .flowOn(Dispatchers.IO)
            .distinctUntilChanged()
            /*.map { entities -> entities.map { it.toTask() } }*/
    }
}