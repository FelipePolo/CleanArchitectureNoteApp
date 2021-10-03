package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository

class AddNote(
    private val noteRepository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw  InvalidNoteException("The Title is empty")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content is empty")
        }
        noteRepository.insertNote(note)
    }
}