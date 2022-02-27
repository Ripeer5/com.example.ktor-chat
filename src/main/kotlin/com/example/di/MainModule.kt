package com.example.di

import com.example.data.MessageDataSourceImpl
import com.example.data.model.MessageDataSource
import com.example.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import kotlin.math.sin

val mainModule = module {
    single {
        KMongo.createClient().coroutine.getDatabase("message_db_test")
    }

    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }

    single {
        RoomController(get())
    }
}