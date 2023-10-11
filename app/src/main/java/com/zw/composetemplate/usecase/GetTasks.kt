package com.zw.composetemplate.usecase

import com.zw.composetemplate.data.repositories.ChannelRepository
import com.zw.composetemplate.framework.entity.Channel
import kotlinx.coroutines.flow.Flow

class GetChannelsUseCase(private val mTaskRepository: ChannelRepository) {
    fun invoke(): Flow<List<Channel>> = mTaskRepository.getChannelFlow()
}