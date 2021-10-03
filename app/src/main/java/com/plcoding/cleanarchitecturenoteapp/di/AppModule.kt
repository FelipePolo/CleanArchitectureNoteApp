package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.feature_node.data.data_source.NoteDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_node.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import com.plcoding.cleanarchitecturenoteapp.feature_node.data.repository.NoteRepositoryImp
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_cases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(app, NoteDatabase::class.java, DATABASE_NAME).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            GetNotes(repository),
            DeleteNote(repository),
            AddNote(repository),
            GetNote(repository)
        )
    }

}