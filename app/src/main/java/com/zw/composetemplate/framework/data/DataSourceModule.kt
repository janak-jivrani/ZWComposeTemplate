package com.zw.composetemplate.framework.data

import com.zw.composetemplate.data.ChannelDataSource
import com.zw.composetemplate.framework.dao.ChannelDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DataSourceModule {

    @Provides
    fun provideChannelDataSource(channelDao: ChannelDao): ChannelDataSource {
        return ChannelDataSourceImpl(channelDao)
    }
}