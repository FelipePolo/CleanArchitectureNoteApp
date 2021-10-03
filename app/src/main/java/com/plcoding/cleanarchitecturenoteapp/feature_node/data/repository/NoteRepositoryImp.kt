package com.plcoding.cleanarchitecturenoteapp.feature_node.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature_node.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImp(private val dao: NoteDao): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.inserNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}