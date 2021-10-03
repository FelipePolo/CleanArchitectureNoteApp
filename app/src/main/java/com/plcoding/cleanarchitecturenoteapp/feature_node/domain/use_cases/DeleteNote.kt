package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository

class DeleteNote(
    private val reposiroty: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        reposiroty.deleteNote(note)
    }
}