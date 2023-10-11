package com.zw.composetemplate.framework.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.zw.composetemplate.framework.entity.Channel
import kotlinx.coroutines.flow.Flow

@Dao
interface ChannelDao {

    @Query("SELECT * from channel")
    fun getChannelFlow(): Flow<List<Channel>>

    @Insert
    fun insertChannel(channel: Channel)
}