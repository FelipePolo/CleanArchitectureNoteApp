package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
       return repository.getNoteById(id)
    }

}