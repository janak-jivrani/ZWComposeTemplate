package com.zw.composetemplate.framework

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zw.composetemplate.framework.dao.ChannelDao
import com.zw.composetemplate.framework.entity.Channel

@Database(entities = [Channel::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun channelDao(): ChannelDao
}